/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-04-12 07:27:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class zTreeDemo5_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/lib/zTree/v3/css/zTreeStyle/zTreeStyle.css\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/lib/jquery/1.9.1/jquery.min.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/lib/zTree/v3/js/jquery.ztree.all-3.5.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("//JSON 就是js对象的另外一种写法\r\n");
      out.write("\r\n");
      out.write("//1.zTree的设置对象，默认可以什么都不写\r\n");
      out.write("var setting = {\r\n");
      out.write("\t\t/* 是否支持复选框 */\r\n");
      out.write("\t\tcheck:{enable:true},\r\n");
      out.write("\t\t/* data ：ztree的数据的相关配置\r\n");
      out.write("\t\t\tsimpleData:是否支持简单格式的数据\r\n");
      out.write("\t\t*/\r\n");
      out.write("\t\tdata:{\r\n");
      out.write("\t\t\tsimpleData: {\r\n");
      out.write("\t\t\t\tenable: true\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t/* 异步加载数据 */\r\n");
      out.write("\t\tasync: {\r\n");
      out.write("\t\t\tenable: true,\r\n");
      out.write("\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/role/getAllPermissions.do\"\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t/* 异步加载成功以后的设置 */\r\n");
      out.write("\t\tcallback: {\r\n");
      out.write("\t\t\tonAsyncSuccess: zTreeOnAsyncSuccess\r\n");
      out.write("\t\t}\r\n");
      out.write("};\r\n");
      out.write("\t//异步加载成功以后回调的函数\r\n");
      out.write("\tfunction zTreeOnAsyncSuccess(event, treeId, treeNode, msg) {\r\n");
      out.write("\t    \r\n");
      out.write("\t\t/*checkbox 回显选中思路\r\n");
      out.write("\t\t  1.在此方法中获取出当前角色在权限表中对应的所有的权限id\r\n");
      out.write("\t\t  2.循环第一步得到的权限的数组，并根据当前权限id，获取zTree对应的节点\r\n");
      out.write("\t\t \t调用zTree的获取指定id节点的方法\r\n");
      out.write("\t\t  3.让对象的节点选中即可\r\n");
      out.write("\t\t*/\r\n");
      out.write("\t\t//模拟 第一步 1\r\n");
      out.write("\t\tvar permissionIds = [11,10,9,1,2,3,6];\r\n");
      out.write("\t\t//获取zTree对象\r\n");
      out.write("\t\tvar treeObj = $.fn.zTree.getZTreeObj(\"permissionTree\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfor(var i = 0;i<permissionIds.length;i++){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar permissionId = permissionIds[i];\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//获取指定id的节点，此节点其实就是当前角色用户的权限对应的那个节点\r\n");
      out.write("\t\t\tvar node = treeObj.getNodeByParam(\"id\",permissionId);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//让节点选中\r\n");
      out.write("\t\t\t//默认有一个父子选中效果，如果父节点选中的话，那么对应的子节点会全部被选中\r\n");
      out.write("\t\t\t//解决方案：让再没有子节点的节点选中即可\r\n");
      out.write("\t\t\tif(node.children == null){\r\n");
      out.write("\t\t\t\ttreeObj.checkNode(node, true, true);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t};\r\n");
      out.write("\r\n");
      out.write("\t//3.初始化ztree\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$.fn.zTree.init($(\"#permissionTree\"), setting);\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\tfunction getCheckedNodes(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//1.获取zTree对象（树对象包含当前所有节点的所有数据）\r\n");
      out.write("\t\tvar treeObj = $.fn.zTree.getZTreeObj(\"permissionTree\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//2.获取选中的所有节点\r\n");
      out.write("\t\tvar nodes = treeObj.getCheckedNodes(true);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//声明数组，封装权限id\r\n");
      out.write("\t\tvar permissionIds = [];\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t//3.循环节点，并获取对应节点的相信信息\r\n");
      out.write("\t\tfor(var i = 0;i<nodes.length;i++){\r\n");
      out.write("\t\t\tvar node = nodes[i];\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar permissionId = node.id;\r\n");
      out.write("\t\t\t//var name = node.name;\r\n");
      out.write("\t\t\t//console.log(id,name);\r\n");
      out.write("\t\t\t//将权限id添加到数组中\r\n");
      out.write("\t\t\tpermissionIds.push(permissionId);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tconsole.log(permissionIds);\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("Ztree的demo<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- ztree是基于列表的，所以必须有一个基本的ul，并且有id和class -->\r\n");
      out.write("<ul id=\"permissionTree\" class=\"ztree\"></ul>\r\n");
      out.write("<button type=\"button\" onclick=\"getCheckedNodes();\">获取选中的节点数据</button>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /zTreeDemo5.jsp(3,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("ctx");
    // /zTreeDemo5.jsp(3,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/zTreeDemo5.jsp(3,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
