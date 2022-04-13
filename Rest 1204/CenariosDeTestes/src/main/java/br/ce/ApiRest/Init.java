package br.ce.ApiRest;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.internal.path.xml.NodeImpl;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class Init {

	@Test
	public void getVersion()
	{	


		given().
			log().all().
		when().
			get("https://desafioonline.webmotors.com.br/api/OnlineChallenge/Version?ModelID=1\r\n"
					+ "").
		then().
			statusCode(200).
			body(containsString("\"ModelID\":1")).
			body(containsString("\"1.5 DX 16V FLEX 4P AUTOMÁTICO\""))	
				;
		;
	}
}
