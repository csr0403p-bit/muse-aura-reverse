package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.Bir, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2721Bir implements InterfaceC2810Bln {
    public final SessionConfiguration A00;
    public final List<C2746Bjn> A01;

    public final boolean equals(Object obj) {
        if (obj instanceof C2721Bir) {
            return C6xC.A00(this.A00, ((C2721Bir) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C2721Bir(int i, List<C2746Bjn> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        ArrayList arrayListA0t = C60Q.A0t(list);
        Iterator<C2746Bjn> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0t.add(it.next().A00.AIM());
        }
        SessionConfiguration sessionConfiguration = new SessionConfiguration(i, arrayListA0t, executor, stateCallback);
        this.A00 = sessionConfiguration;
        List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
        ArrayList arrayListA0t2 = C60Q.A0t(outputConfigurations);
        Iterator<OutputConfiguration> it2 = outputConfigurations.iterator();
        while (it2.hasNext()) {
            arrayListA0t2.add(C2746Bjn.A00(it2.next()));
        }
        this.A01 = Collections.unmodifiableList(arrayListA0t2);
    }
}
