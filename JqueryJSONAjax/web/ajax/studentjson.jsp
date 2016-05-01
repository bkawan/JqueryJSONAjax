<%-- 
    Document   : studentjson
    Created on : Apr 26, 2016, 8:38:53 PM
    Author     : bikeshkawan
--%>
<%@page  import="java.util.ArrayList,com.bk.jqueryajax.entity.Student" %>

<% ArrayList<Student> stds = new ArrayList<Student>();

stds.add(new Student(1,"John paul",true));
stds.add(new Student(2,"shelia bradford",true));

out.println("[");//object inside array
int i = 0;
for(Student s:stds){
    //out.println("{id:"+ s.getId() + ",name:\"" + s.getName()+"\",status:" + s.isStatus()+"}");
    String studentObj = "{\"id\":"+ s.getId() + ",\"name\":\"" + s.getName()+"\",\"status\":" + s.isStatus()+"}";
    if(i!= stds.size() -1){
        studentObj+= ", ";
    }
        out.println(studentObj);
        i++;

}
out.println("]");



%>