/* Generated By:JJTree: Do not edit this line. ASTDoWhileStmt.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package analyzer.ast;

public
class ASTDoWhileStmt extends SimpleNode {
  public ASTDoWhileStmt(int id) {
    super(id);
  }

  public ASTDoWhileStmt(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=d9eb7c7d5dd3ad10042069eac51ccd98 (do not edit this line) */