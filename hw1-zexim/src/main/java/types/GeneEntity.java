

/* First created by JCasGen Mon Sep 22 15:30:59 EDT 2014 */
package types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Sep 22 22:34:04 EDT 2014
 * XML source: /home/kylemao/git/hw1-zexim/hw1-zexim/src/main/resources/type_system/typeSystemDescriptor.xml
 * @generated */
public class GeneEntity extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GeneEntity.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected GeneEntity() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public GeneEntity(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public GeneEntity(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public GeneEntity(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: entityText

  /** getter for entityText - gets 
   * @generated
   * @return value of the feature 
   */
  public String getEntityText() {
    if (GeneEntity_Type.featOkTst && ((GeneEntity_Type)jcasType).casFeat_entityText == null)
      jcasType.jcas.throwFeatMissing("entityText", "types.GeneEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneEntity_Type)jcasType).casFeatCode_entityText);}
    
  /** setter for entityText - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEntityText(String v) {
    if (GeneEntity_Type.featOkTst && ((GeneEntity_Type)jcasType).casFeat_entityText == null)
      jcasType.jcas.throwFeatMissing("entityText", "types.GeneEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneEntity_Type)jcasType).casFeatCode_entityText, v);}    
  }

    