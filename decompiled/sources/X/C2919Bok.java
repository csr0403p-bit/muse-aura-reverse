package X;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: X.Bok, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2919Bok extends View {
    public Window A00;
    public InterfaceC2787BlA A01;
    public AbstractC2922Bon A02;

    /* JADX INFO: Access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.A00;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        AbstractC2875Bni.A02("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f) {
        String str;
        Window window = this.A00;
        if (window == null) {
            str = "setBrightness: mScreenFlashWindow is null!";
        } else {
            if (!Float.isNaN(f)) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.screenBrightness = f;
                this.A00.setAttributes(attributes);
                float f2 = attributes.screenBrightness;
                StringBuilder sbA0g = C3cG.A0g("Brightness set to ");
                sbA0g.append(f2);
                AbstractC2875Bni.A01("ScreenFlashView", sbA0g.toString());
                return;
            }
            str = "setBrightness: value is NaN!";
        }
        AbstractC2875Bni.A02("ScreenFlashView", str);
    }

    private void setScreenFlashUiInfo(InterfaceC2787BlA interfaceC2787BlA) {
        AbstractC2875Bni.A01("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    public InterfaceC2787BlA getScreenFlash() {
        return this.A01;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(AbstractC2922Bon abstractC2922Bon) {
        BoT.A00();
        this.A02 = abstractC2922Bon;
        if (abstractC2922Bon != null) {
            throw BV4.A0a("getImageCaptureFlashMode");
        }
    }

    public void setScreenFlashWindow(Window window) {
        BoT.A00();
        if (this.A00 != window) {
            this.A01 = window == null ? null : new HwE(this);
        }
        this.A00 = window;
        setScreenFlashUiInfo(this.A01);
    }
}
