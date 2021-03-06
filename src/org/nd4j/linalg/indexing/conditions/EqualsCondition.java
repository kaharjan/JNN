package org.nd4j.linalg.indexing.conditions;

import org.nd4j.linalg.api.complex.IComplexNumber;

/**
 * Created by agibsonccc on 10/8/14.
 */
public class EqualsCondition extends BaseCondition {
    public EqualsCondition(Number value) {
        super(value);
    }

    public EqualsCondition(IComplexNumber complexNumber) {
        super(complexNumber);
    }

    @Override
    public Boolean apply(Number input) {
        return input.equals(value);
    }

    @Override
    public Boolean apply(IComplexNumber input) {
        return complexNumber.equals(input);
    }
}
