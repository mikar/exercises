package codingbat.ap;

import java.util.ArrayList;
import java.util.List;

public class AP1 {

	public static boolean scoresIncreasing( final int[] is ) {
		for ( int i = 1; i < is.length; i++ ) {
			if ( is[i] >= is[i - 1] ) {
				return true;
			}
		}
		return false;
	}

	public static boolean scores100( final int[] is ) {
		for ( int i = 0; i < is.length - 1; i++ ) {
			if ( is[i] == 100 && is[i + 1] == 100 ) {
				return true;
			}

		}
		return false;
	}

	public static boolean scoresClump( final int[] is ) {
		for ( int i = 0; i < is.length - 2; i++ ) {
			if ( is[i + 2] - is[i] <= 2 && is[i + 1] - is[i] <= 2 ) {
				return true;
			}
		}
		return false;
	}

	public static int scoresAverage( final int[] is ) {
		final int mid = is.length / 2;
		final int avg1 = average( is, 0, mid );
		final int avg2 = average( is, mid, is.length );
		return Math.max( avg1, avg2 );
	}

	private static int average( final int[] scores, final int start,
			final int end ) {
		int result = 0;
		for ( int i = start; i < end; i++ ) {
			result += scores[i];
		}
		return result / ( end - start );
	}

	public static int wordsCount( final String[] strings, final int i ) {
		int counter = 0;
		for ( final String s : strings ) {
			if ( s.length() == i ) {
				counter++;
			}
		}
		return counter;
	}

	public static String[] wordsFront( final String[] strings, final int n ) {
		final String[] result = new String[n];

		for ( int i = 0; i < n; i++ ) {
			result[i] = strings[i];
		}

		return result;
	}

	public static List<String> wordsWithoutList( final String[] strings,
			final int n ) {
		final List<String> result = new ArrayList<String>();
		for ( final String s : strings ) {
			if ( !( s.length() == n ) ) {
				result.add( s );
			}
		}

		return result;
	}

	public static boolean hasOne( int i ) {
		while ( i > 0 ) {
			if ( i == 1 ) {
				return true;
			}
			i /= 10;
		}
		return false;
	}

	public static boolean dividesSelf( int i ) {
		while ( i > 0 ) {
			if ( i % 10 == 0 ) {
				return false;
			}
			i /= 10;
		}
		return true;
	}

	public static int[] copyEvens( final int[] is, final int n ) {
		final int[] result = new int[n];
		int idx = 0;

		for ( final int i : is ) {
			if ( idx >= n ) {
				break;
			}
			if ( i % 2 == 0 ) {
				result[idx] = i;
				idx++;
			}
		}

		return result;
	}

	public static int[] copyEndy( final int[] is, final int n ) {
		int idx = 0;
		final int[] result = new int[n];

		for ( final int i : is ) {
			if ( ( i >= 0 && i <= 10 ) || ( i >= 90 && i <= 100 ) ) {
				if ( idx == n ) {
					break;
				} else {
					result[idx] = i;
					idx++;
				}
			}
		}
		return result;
	}

}
