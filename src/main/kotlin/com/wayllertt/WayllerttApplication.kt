package com.wayllertt

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class WayllerttApplication {
	companion object {

		@JvmStatic
		public fun main(args: Array<String>) {
			SpringApplication.run(WayllerttApplication::class.java, *args)
		}

	}

}
