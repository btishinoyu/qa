<div id="wrapper">
	<h1>Hello world!</h1>
	<p>The time on the server is ${serverTime}.</p>

	<hr>

	<form:form modelAttribute="NW01Form"
		action="${pageContext.request.contextPath}/view">
		<form:label path="text">Input Text</form:label>
		<form:input path="text" />
		<input type="submit" name="confirm" value="Confirm" />
	</form:form>

    <form:form modelAttribute="abcForm"
        action="${pageContext.request.contextPath}/abc">
        <form:label path="text">Input Text</form:label>
        <form:input path="text" />
        <input type="submit" name="confirm" value="Confirm" />
    </form:form>
</div>
