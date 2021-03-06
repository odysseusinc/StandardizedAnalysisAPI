package org.ohdsi.standardized_analysis_api.cohortcharacterization;

import org.apache.commons.io.IOUtils;

import java.io.IOException;

public class BaseTest {

    protected String readResource(String path) throws IOException {

        return IOUtils.toString(
                this.getClass().getResourceAsStream(path),
                "UTF-8"
        );
    }
}
