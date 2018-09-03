package com.capgemini.day5.tests;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import com.day5.AgeNotWithinRangeException;
import com.day5.NameNotValidException;
import com.day5.Student;

class StudentTest {


		@Test
		void testStudent()
			throws NameNotValidException,AgeNotWithinRangeException {
			//	assertEquals(null,new Student(11,"Sr",21,"Java"));
				assertThrows(AgeNotWithinRangeException.class,()-> new Student(11,"Manjula",22,"Java"));
				assertThrows(NameNotValidException.class,()-> new Student(11,"Madhav1",21,"Java"));
		}

	}
	