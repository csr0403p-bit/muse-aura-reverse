package X;

import android.hardware.camera2.CaptureResult;
import java.nio.BufferUnderflowException;

/* renamed from: X.BnD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2858BnD implements InterfaceC2861BnK {
    public final CaptureResult A00;
    public final BhZ A01;

    public final Integer A00() {
        Number numberA0i = BV6.A0i(CaptureResult.CONTROL_AF_MODE, this.A00);
        if (numberA0i == null) {
            return C79.A00;
        }
        int iIntValue = numberA0i.intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1 || iIntValue == 2) {
                return C79.A0C;
            }
            if (iIntValue == 3 || iIntValue == 4) {
                return C79.A0K;
            }
            if (iIntValue != 5) {
                AbstractC2875Bni.A02("C2CameraCaptureResult", AnonymousClass007.A0a("Undefined af mode: ", numberA0i));
                return C79.A00;
            }
        }
        return C79.A01;
    }

    @Override // X.InterfaceC2861BnK
    public final BnG ACG() {
        Number numberA0i = BV6.A0i(CaptureResult.CONTROL_AE_STATE, this.A00);
        if (numberA0i == null) {
            return BnG.UNKNOWN;
        }
        int iIntValue = numberA0i.intValue();
        if (iIntValue == 0) {
            return BnG.INACTIVE;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return BnG.CONVERGED;
            }
            if (iIntValue == 3) {
                return BnG.LOCKED;
            }
            if (iIntValue == 4) {
                return BnG.FLASH_REQUIRED;
            }
            if (iIntValue != 5) {
                AbstractC2875Bni.A02("C2CameraCaptureResult", AnonymousClass007.A0a("Undefined ae state: ", numberA0i));
                return BnG.UNKNOWN;
            }
        }
        return BnG.SEARCHING;
    }

    @Override // X.InterfaceC2861BnK
    public final EnumC2859BnF ACH() {
        Number numberA0i = BV6.A0i(CaptureResult.CONTROL_AF_STATE, this.A00);
        if (numberA0i == null) {
            return EnumC2859BnF.UNKNOWN;
        }
        switch (numberA0i.intValue()) {
            case 0:
                break;
            case 1:
            case 3:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                AbstractC2875Bni.A02("C2CameraCaptureResult", AnonymousClass007.A0a("Undefined af state: ", numberA0i));
                break;
        }
        return EnumC2859BnF.UNKNOWN;
    }

    @Override // X.InterfaceC2861BnK
    public final EnumC2860BnH ACg() {
        Number numberA0i = BV6.A0i(CaptureResult.CONTROL_AWB_STATE, this.A00);
        if (numberA0i == null) {
            return EnumC2860BnH.UNKNOWN;
        }
        int iIntValue = numberA0i.intValue();
        if (iIntValue == 0) {
            return EnumC2860BnH.INACTIVE;
        }
        if (iIntValue == 1) {
            return EnumC2860BnH.METERING;
        }
        if (iIntValue == 2) {
            return EnumC2860BnH.CONVERGED;
        }
        if (iIntValue == 3) {
            return EnumC2860BnH.LOCKED;
        }
        AbstractC2875Bni.A02("C2CameraCaptureResult", AnonymousClass007.A0a("Undefined awb state: ", numberA0i));
        return EnumC2860BnH.UNKNOWN;
    }

    @Override // X.InterfaceC2861BnK
    public final CaptureResult ADS() {
        return this.A00;
    }

    @Override // X.InterfaceC2861BnK
    public final Integer AFm() {
        Number numberA0i = BV6.A0i(CaptureResult.FLASH_STATE, this.A00);
        if (numberA0i == null) {
            return C79.A00;
        }
        int iIntValue = numberA0i.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return C79.A01;
        }
        if (iIntValue == 2) {
            return C79.A0C;
        }
        if (iIntValue == 3 || iIntValue == 4) {
            return C79.A0K;
        }
        AbstractC2875Bni.A02("C2CameraCaptureResult", AnonymousClass007.A0a("Undefined flash state: ", numberA0i));
        return C79.A00;
    }

    @Override // X.InterfaceC2861BnK
    public final BhZ ALU() {
        return this.A01;
    }

    @Override // X.InterfaceC2861BnK
    public final long getTimestamp() {
        Number numberA0i = BV6.A0i(CaptureResult.SENSOR_TIMESTAMP, this.A00);
        if (numberA0i == null) {
            return -1L;
        }
        return numberA0i.longValue();
    }

    public C2858BnD(CaptureResult captureResult, BhZ bhZ) {
        this.A01 = bhZ;
        this.A00 = captureResult;
    }

    @Override // X.InterfaceC2861BnK
    public final void AY5(C2963BqE c2963BqE) throws NumberFormatException {
        BnJ.A00(this, c2963BqE);
        try {
            Number numberA0i = BV6.A0i(CaptureResult.JPEG_ORIENTATION, this.A00);
            if (numberA0i != null) {
                c2963BqE.A03(numberA0i.intValue());
            }
        } catch (BufferUnderflowException unused) {
            AbstractC2875Bni.A03("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        CaptureResult captureResult = this.A00;
        if (BV6.A0i(CaptureResult.SENSOR_EXPOSURE_TIME, captureResult) != null) {
            c2963BqE.A04("ExposureTime", String.valueOf(r0.longValue() / 1.0E9d));
        }
        Number numberA0i2 = BV6.A0i(CaptureResult.LENS_APERTURE, captureResult);
        if (numberA0i2 != null) {
            c2963BqE.A04("FNumber", String.valueOf(numberA0i2.floatValue()));
        }
        Number numberA0i3 = BV6.A0i(CaptureResult.SENSOR_SENSITIVITY, captureResult);
        if (numberA0i3 != null) {
            if (BV6.A0i(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST, captureResult) != null) {
                numberA0i3 = Integer.valueOf(numberA0i3.intValue() * ((int) (r0.intValue() / 100.0f)));
            }
            int iIntValue = numberA0i3.intValue();
            c2963BqE.A04("SensitivityType", String.valueOf(3));
            c2963BqE.A04("PhotographicSensitivity", String.valueOf(Math.min(65535, iIntValue)));
        }
        Number numberA0i4 = BV6.A0i(CaptureResult.LENS_FOCAL_LENGTH, captureResult);
        if (numberA0i4 != null) {
            c2963BqE.A04("FocalLength", new C2954Bpr((long) (numberA0i4.floatValue() * 1000.0f), 1000L).toString());
        }
        Number numberA0i5 = BV6.A0i(CaptureResult.CONTROL_AWB_MODE, captureResult);
        if (numberA0i5 != null) {
            Integer num = C79.A00;
            if (numberA0i5.intValue() == 0) {
                num = C79.A01;
            }
            c2963BqE.A04("WhiteBalance", String.valueOf(AnonymousClass002.A1L(num.intValue()) ? 1 : 0));
        }
    }
}
