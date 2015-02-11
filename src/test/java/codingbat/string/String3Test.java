package codingbat.string;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class String3Test {

	@Test
	public void testCountYZ() {
		assertThat( String3.countYZ( "fez day" ), is( 2 ) );
		assertThat( String3.countYZ( "day fez" ), is( 2 ) );
		assertThat( String3.countYZ( "day fyyyz" ), is( 2 ) );
	}

	@Test
	public void testWithoutString() {
		assertThat( String3.withoutString( "Hello there", "llo" ), is( "He there" ) );
		assertThat( String3.withoutString( "Hello there", "e" ), is( "Hllo thr" ) );
		assertThat( String3.withoutString( "Hello there", "x" ), is( "Hello there" ) );
	}
}