package com.example.songr;

import com.example.songr.modals.Album;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SongrApplicationTests {

	////////////////////////////////////// lab 11 //////////////////////////////////////////////
	@Test
	public void testAlbumClass() {
		Album album1 = new Album("life","Ibrahim",1,240,"https://www.udiscovermusic" +
				".com/wp-content/uploads/2019/05/Elton-John-self-titled-album-cover-web-optimised-820.jpg");

		assertEquals("life",album1.getTitle());
		album1.setArtist("ahmad");
		assertEquals("ahmad",album1.getArtist());
	}
}
