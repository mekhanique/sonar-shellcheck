/**
 * Copyright (c) 2018-2021, Sylvain Baudoin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.sbaudoin.sonar.plugins.shellcheck.languages;

import com.github.sbaudoin.sonar.plugins.shellcheck.settings.ShellCheckSettings;
import org.apache.commons.lang.StringUtils;
import org.sonar.api.config.Configuration;
import org.sonar.api.resources.AbstractLanguage;

import java.util.ArrayList;
import java.util.List;

/**
 * Describes the Shell language and tells when it applies
 */
public class ShellLanguage extends AbstractLanguage {
    public static final String NAME = "Shell";
    public static final String KEY = "shell";


    private final Configuration config;


    /**
     * Constructor
     *
     * @param config the SonarQube configuration for this language
     */
    public ShellLanguage(Configuration config) {
        super(KEY, NAME);
        this.config = config;
    }


    /**
     * Returns the file suffixes ({@code .sh} and {@code .ksh} by default) that identify Shell scripts
     *
     * @return a list of file suffixes that identify Shell scripts
     */
    @Override
    public String[] getFileSuffixes() {
        String[] suffixes = filterEmptyStrings(config.getStringArray(ShellCheckSettings.FILE_SUFFIXES_KEY));
        if (suffixes.length == 0) {
            suffixes = StringUtils.split(ShellCheckSettings.FILE_SUFFIXES_DEFAULT_VALUE, ",");
        }
        return suffixes;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * Cleans up the passed String array to remove empty strings, i.e. strings that are {@code null} or contain only
     * spaces
     *
     * @param stringArray an array of strings to be cleaned up
     * @return the cleaned up version of {@code stringArray}
     */
    private String[] filterEmptyStrings(String[] stringArray) {
        List<String> nonEmptyStrings = new ArrayList<>();
        for (String string : stringArray) {
            if (StringUtils.isNotBlank(string.trim())) {
                nonEmptyStrings.add(string.trim());
            }
        }
        return nonEmptyStrings.toArray(new String[nonEmptyStrings.size()]);
    }
}
