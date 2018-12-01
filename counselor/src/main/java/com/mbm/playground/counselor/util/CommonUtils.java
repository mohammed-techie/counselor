package com.mbm.playground.counselor.util;

import java.util.Optional;

public class CommonUtils {

    public static String getStringOrNull(String str) {
	return Optional.ofNullable(str).map(s -> s.trim()).orElse(null);
    }

}
