package com.github.rs.units.quantities.volume;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

class UT_Volume {

    @Test
    void verify_conversion_constants() {
        final Volume volume = Volume.inLiters(1.0);
        //@formatter:off
        assertThat(volume.toFluidOunces().getValue(), equalTo(33.81402));
        assertThat(volume.toCups()       .getValue(), equalTo( 4.2267525));
        assertThat(volume.toPints()      .getValue(), equalTo( 2.11337625));
        assertThat(volume.toQuarts()     .getValue(), equalTo( 1.056688125));
        assertThat(volume.toGallons()    .getValue(), equalTo( 0.26417203125));
        assertThat(volume.toLiters()     .getValue(), equalTo( 1.0e+00));
        assertThat(volume.toMilliLiters().getValue(), equalTo( 1.0e+03));
        //@formatter:on
    }

    @Test
    void verify_inLiters_method() {
        //@formatter:off
        assertThat(Volume.inLiters( null).toLiters()     .getValue(), equalTo(  null));
        assertThat(Volume.inLiters( 47.0).toLiters()     .getValue(), equalTo( 47.00));
        assertThat(Volume.inLiters(  2.2).toMilliLiters().getValue(), equalTo(2200.0));
        assertThat(Volume.inLiters(  1.5).toFluidOunces().getValue(), equalTo(  50.72103));
        //@formatter:on
    }

    @Test
    void verify_inFluidOunces_method() {
        //@formatter:off
        assertThat(Volume.inFluidOunces(null ).toFluidOunces().getValue(), equalTo(null ));
        assertThat(Volume.inFluidOunces(128.0).toFluidOunces().getValue(), equalTo(128.0));
        assertThat(Volume.inFluidOunces(128.0).toCups()       .getValue(), equalTo( 16.0));
        assertThat(Volume.inFluidOunces(128.0).toPints()      .getValue(), equalTo(  8.0));
        assertThat(Volume.inFluidOunces(128.0).toQuarts()     .getValue(), equalTo(  4.0));
        assertThat(Volume.inFluidOunces(128.0).toGallons()    .getValue(), equalTo(  1.0));
        assertThat(Volume.inFluidOunces(128.0).toLiters()     .getValue(), equalTo(  3.78541208646591));
        //@formatter:on
    }
}
