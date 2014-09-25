package implementation;

import java.util.Map;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

import types.GeneEntity;

/**
 * An  annotator based on the POS tags of words and post processing.
 * 
 * @author kylemao
 * @version 0.1
 * 
 */
public class PosTagAnnotator extends JCasAnnotator_ImplBase {

  /*
   * Reads a sentence from the CAS and annotates it with POS tag information.
   * 
   * @see
   * org.apache.uima.analysis_component.JCasAnnotator_ImplBase#process(org.apache.uima.jcas.JCas)
   */
  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    PosTagNamedEntityRecognizer recognizer = null;
    try {
      recognizer = new PosTagNamedEntityRecognizer();
    } catch (ResourceInitializationException e) {
      e.printStackTrace();
    }
    
    String sentenceText = aJCas.getDocumentText();
    Map<Integer, Integer> begin2end = recognizer.getGeneSpans(sentenceText);
    for (Map.Entry<Integer, Integer> entry : begin2end.entrySet()) {
      String entityText = sentenceText.substring(entry.getKey(), entry.getValue());
      
      // Get the index of non-whitespace characters.
      int begin = sentenceText.substring(0, entry.getKey()).replaceAll("\\s", "").length();
      int end = sentenceText.substring(0, entry.getValue()).replaceAll("\\s", "").length() - 1;
      
      // Remove token with single character.
      if (begin == end)
        continue;
      // Remove single lower-case words with length less than 5.
      if (end - begin < 4 && entityText.matches("[[a-z][^\\w]]+"))
          continue;
          
      GeneEntity geneEntity = new GeneEntity(aJCas);
      geneEntity.setBegin(begin);
      geneEntity.setEnd(end);
      geneEntity.setEntityText(entityText);
      geneEntity.addToIndexes();
    }
  }

}