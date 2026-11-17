package X;

import android.graphics.Bitmap;

/* renamed from: X.EiM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7204EiM extends AbstractC7209EiU<EfF<InterfaceC7064EfB>> {
    @Override // X.AbstractC7209EiU
    public void onNewResultImpl(InterfaceC7236Ej0<EfF<InterfaceC7064EfB>> interfaceC7236Ej0) {
        C7384Etj.A0Y(interfaceC7236Ej0, 0);
        if (interfaceC7236Ej0.AOQ()) {
            EfF<InterfaceC7064EfB> efFAJm = interfaceC7236Ej0.AJm();
            try {
                onNewResultImpl((efFAJm == null || !(efFAJm.A04() instanceof AbstractC7067EfE)) ? null : ((AbstractC7067EfE) efFAJm.A04()).A04);
            } finally {
                if (efFAJm != null) {
                    efFAJm.close();
                }
            }
        }
    }

    public abstract void onNewResultImpl(Bitmap bitmap);
}
