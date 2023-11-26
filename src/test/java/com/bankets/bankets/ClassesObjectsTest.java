package com.bankets.bankets;

import com.bankets.bankets.classes.Pc;
import com.bankets.bankets.classes.SingletonUniquePC;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ClassesObjectsTest {

	@Test
	void equalsObjects() {
		SingletonUniquePC uniquePC1 = SingletonUniquePC.getInstance();
		SingletonUniquePC uniquePC2 = SingletonUniquePC.getInstance();
		assertEquals(uniquePC1, uniquePC2);

		Pc pc1 = new Pc("name", "cpu", "gpu", "ram", "storage");
		String selfWritedCpu = "cpu";
		String cpu1 = pc1.getCpu();
		assertEquals(cpu1, selfWritedCpu);

	}

}
