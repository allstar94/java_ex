<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="mybatis.vo.EmpVO" %>
<%@ page import="mybatis.dao.EmpDAO" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>total 페이지</title>
<style type="text/css">
   table {
      width:500px;
      border-collapse: callapse;
   }
   table, table, th, table>tbody td{
      border:  1px solid black;
      padding: 4px;
   }
   
   table thead>tr:first-child>th { border:0px; }
   
   #add_win{
      width: 200px;
      border: 1px solid black;
      background-color: #fff;
      position: absolute;
      top: 100px;
      left: 580px;
      display: none;
   }
   
   #add_win input[type=text]{
      width: 90px;
      padding: 3px;
      border: 1px solid black;
      margin-bottom: 5px;
   }
</style>
</head>
<body>
   <header>
      <h1>사원 목록</h1>
   </header>
   <article>
      <table>
         <caption>사람들의 목록을 위한 테이블</caption>   
         <thead>
            <tr>
               <th colspan="3" style="text-align: right;">
               <input type="button" value="사원 추가" id="add_btn" onclick="addFun();"/>
               </th>
            </tr>
            
            <tr>
               <th bgcolor="orange">사원번호</th>
               <th bgcolor="orange">사원명</th>
               <th bgcolor="orange">직책</th>            
            </tr>
         </thead>
         <tbody>
               <%
                  List<EmpVO> list = EmpDAO.getTotal();
                  
                  if(list != null && 0 < list.size()){
                     for(EmpVO vo : list){
               %>
                     <tr>
                        <td><%= vo.getEmpno() %></td>
                        <td><%= vo.getEname() %></td>
                        <td><%= vo.getPosition() %></td>
                     </tr>
               <%
                     }
                  }
               %>                              
         </tbody>
      </table>
   </article>
   <div id="add_win" >
      <header>
         <h2>사원추가 </h2>
      </header> 
         <div id="body">
            <form action="add.jsp" method="POST">
               <label for="empno">사원번호</label>
               <input type="text" id="empno" name="empno"/><br>
               
               <label for="ename">이름</label>
               <input type="text" id="ename" name="ename"/><br>
               
               <label for="position">직책</label>
               <input type="text" id="position" name="position"/><br><br>
               
               <input type="button" value="추가" id="append_btn" onclick="sendData()"/>
               <input type="button" value="취소" id="calcel_btn" onclick="closeWin()"/>
            </form>
            <br/>
         </div>
   </div>
   <script type="text/javascript">
      function addFun(){
         var addWin = document.getElementById("add_win");
         addWin.style.display = "block";
      }
      
      function sendData(){
         var empno = document.getElementById("empno").value;
         var ename = document.getElementById("ename").value;
         var position = document.getElementById("position").value;
         
         if(empno.trim().length < 1){
            document.getElementById("empno").value = "";
            alert("사원번호를 입력하세요")
            document.getElementById("empno").focus();
            return;
         }
         document.forms[0].submit();   //submit 객
      }
      
      function closeWin(){
         var addWin = document.getElementById("add_win");
         addWin.style.display = "none";
      }
      
   </script>
</body>
</html>