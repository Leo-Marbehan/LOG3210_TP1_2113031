/* Generated By:JavaCC: Do not edit this line. ParserDefaultVisitor.java Version 7.0.2 */
package analyzer.ast;

public class ParserDefaultVisitor implements ParserVisitor{
  public Object defaultVisit(SimpleNode node, Object data){
    node.childrenAccept(this, data);
    return data;
  }
  public Object visit(SimpleNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTProgram node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTAssignStmt node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTIdentifier node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTIntValue node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTRealValue node, Object data){
    return defaultVisit(node, data);
  }
}
/* JavaCC - OriginalChecksum=6104d4d97145fbe5350d3071651e8cb2 (do not edit this line) */