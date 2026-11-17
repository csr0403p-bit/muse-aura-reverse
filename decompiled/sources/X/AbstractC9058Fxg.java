package X;

import android.health.connect.datatypes.units.BloodGlucose;
import android.health.connect.datatypes.units.Energy;
import android.health.connect.datatypes.units.Length;
import android.health.connect.datatypes.units.Mass;
import android.health.connect.datatypes.units.Percentage;
import android.health.connect.datatypes.units.Power;
import android.health.connect.datatypes.units.Pressure;
import android.health.connect.datatypes.units.Temperature;
import android.health.connect.datatypes.units.TemperatureDelta;
import android.health.connect.datatypes.units.Velocity;
import android.health.connect.datatypes.units.Volume;

/* renamed from: X.Fxg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9058Fxg {
    public static final Energy A01(C9076Fy3 c9076Fy3) {
        C7384Etj.A0Y(c9076Fy3, 0);
        Energy energyFromCalories = Energy.fromCalories(c9076Fy3.A00 * c9076Fy3.A01.A00());
        C7384Etj.A0U(energyFromCalories);
        return energyFromCalories;
    }

    public static final Length A02(Fy1 fy1) {
        C7384Etj.A0Y(fy1, 0);
        Length lengthFromMeters = Length.fromMeters(AbstractC7609F5w.A01(fy1));
        C7384Etj.A0U(lengthFromMeters);
        return lengthFromMeters;
    }

    public static final Mass A03(C9072Fxy c9072Fxy) {
        C7384Etj.A0Y(c9072Fxy, 0);
        Mass massFromGrams = Mass.fromGrams(c9072Fxy.A00 * c9072Fxy.A01.A00());
        C7384Etj.A0U(massFromGrams);
        return massFromGrams;
    }

    public static final Power A05(C9077Fy4 c9077Fy4) {
        C7384Etj.A0Y(c9077Fy4, 0);
        Power powerFromWatts = Power.fromWatts(c9077Fy4.A00 * c9077Fy4.A01.A00());
        C7384Etj.A0U(powerFromWatts);
        return powerFromWatts;
    }

    public static final Velocity A09(C9078Fy5 c9078Fy5) {
        C7384Etj.A0Y(c9078Fy5, 0);
        Velocity velocityFromMetersPerSecond = Velocity.fromMetersPerSecond(c9078Fy5.A00 * c9078Fy5.A01.A00());
        C7384Etj.A0U(velocityFromMetersPerSecond);
        return velocityFromMetersPerSecond;
    }

    public static final BloodGlucose A00(C9080Fy7 c9080Fy7) {
        BloodGlucose bloodGlucoseFromMillimolesPerLiter = BloodGlucose.fromMillimolesPerLiter(c9080Fy7.A00 * c9080Fy7.A01.A00());
        C7384Etj.A0U(bloodGlucoseFromMillimolesPerLiter);
        return bloodGlucoseFromMillimolesPerLiter;
    }

    public static final Percentage A04(Hj8 hj8) {
        Percentage percentageFromValue = Percentage.fromValue(hj8.A00);
        C7384Etj.A0U(percentageFromValue);
        return percentageFromValue;
    }

    public static final Pressure A06(C9095FyM c9095FyM) {
        Pressure pressureFromMillimetersOfMercury = Pressure.fromMillimetersOfMercury(c9095FyM.A00);
        C7384Etj.A0U(pressureFromMillimetersOfMercury);
        return pressureFromMillimetersOfMercury;
    }

    public static final Volume A0A(C9079Fy6 c9079Fy6) {
        Volume volumeFromLiters = Volume.fromLiters(c9079Fy6.A00 * c9079Fy6.A01.A00());
        C7384Etj.A0U(volumeFromLiters);
        return volumeFromLiters;
    }

    public static final Temperature A07(C9087FyE c9087FyE) {
        Temperature temperatureFromCelsius = Temperature.fromCelsius(c9087FyE.A00());
        C7384Etj.A0U(temperatureFromCelsius);
        return temperatureFromCelsius;
    }

    public static final TemperatureDelta A08(C9082Fy9 c9082Fy9) {
        TemperatureDelta temperatureDeltaFromCelsius = TemperatureDelta.fromCelsius(c9082Fy9.A00());
        C7384Etj.A0U(temperatureDeltaFromCelsius);
        return temperatureDeltaFromCelsius;
    }
}
