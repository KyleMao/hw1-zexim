
/* First created by JCasGen Mon Sep 22 15:30:59 EDT 2014 */
package types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Mon Sep 22 22:34:04 EDT 2014
 * @generated */
public class GeneEntity_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (GeneEntity_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = GeneEntity_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new GeneEntity(addr, GeneEntity_Type.this);
  			   GeneEntity_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new GeneEntity(addr, GeneEntity_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = GeneEntity.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("types.GeneEntity");
 
  /** @generated */
  final Feature casFeat_entityText;
  /** @generated */
  final int     casFeatCode_entityText;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getEntityText(int addr) {
        if (featOkTst && casFeat_entityText == null)
      jcas.throwFeatMissing("entityText", "types.GeneEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_entityText);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEntityText(int addr, String v) {
        if (featOkTst && casFeat_entityText == null)
      jcas.throwFeatMissing("entityText", "types.GeneEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_entityText, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public GeneEntity_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_entityText = jcas.getRequiredFeatureDE(casType, "entityText", "uima.cas.String", featOkTst);
    casFeatCode_entityText  = (null == casFeat_entityText) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_entityText).getCode();

  }
}



    