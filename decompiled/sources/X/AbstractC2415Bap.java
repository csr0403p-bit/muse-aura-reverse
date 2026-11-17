package X;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import java.nio.BufferUnderflowException;

/* renamed from: X.Bap, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2415Bap {
    public static boolean A00(InterfaceC2417Bar interfaceC2417Bar) {
        Boolean bool;
        try {
            bool = (Boolean) ((C2416Baq) interfaceC2417Bar).A00.A02(CameraCharacteristics.FLASH_INFO_AVAILABLE);
            if (bool == null) {
                AbstractC2875Bni.A03("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
                return false;
            }
        } catch (BufferUnderflowException e) {
            BX1 bx1A01 = AbstractC2398BaB.A00.A01(FlashAvailabilityBufferUnderflowQuirk.class);
            Object[] objArr = {Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)};
            if (bx1A01 != null) {
                AbstractC2875Bni.A07("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", "FlashAvailability", objArr);
            } else {
                AbstractC2875Bni.A05("FlashAvailability", String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", objArr), e);
            }
            bool = false;
        }
        return bool.booleanValue();
    }
}
