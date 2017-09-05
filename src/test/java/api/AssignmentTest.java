package api;


import io.dropwizard.jersey.validation.Validators;
import org.junit.Test;

import javax.validation.Validator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;


public class AssignmentTest {

    private final Validator validator = Validators.newValidator();

    @Test
    public void testA2() {
        CreateReceiptRequest receipt = new CreateReceiptRequest();
        validator.validate(receipt);
        assertThat(validator.validate(receipt), hasSize(1));
    }
}