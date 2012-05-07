package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Task;

import org.junit.*;

import play.mvc.*;
import play.test.*;
import play.libs.F.*;
import play.data.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

public class ApplicationTest {
	
	@Test
	public void simpleCheck() {
		int a = 1 + 1;
		assertThat(a).isEqualTo(2);
	}
	
}