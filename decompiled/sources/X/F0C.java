package X;

import android.os.Handler;
import androidx.work.impl.WorkDatabase_Impl;
import com.crossapp.tigonhttp.noise.NoiseChannelManagerHolder;
import com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.network.noise.AuraNoiseVmTransport;
import com.facebook.aura.network.tigon.AuraTigonServiceProvider;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public interface F0C<T> {
    boolean AOX();

    T getValue();

    static Handler A00() {
        return (Handler) AuraExecutors.uiThreadHandler$delegate.getValue();
    }

    static EL5 A01(Object obj) {
        return ((WorkDatabase_Impl) obj).A06.getValue();
    }

    static DCW A02() {
        return (DCW) AuraTigonServiceProvider.tigonHttpClient$delegate.getValue();
    }

    static NoiseChannelManagerHolder A03() {
        return AuraNoiseVmTransport.managerHolderLazy.getValue();
    }

    static C4oT A04() {
        return (C4oT) AuraMetaFRLSecureTokenStore.prefs$delegate.getValue();
    }

    static Executor A05() {
        return (Executor) AuraExecutors.ioExecutor$delegate.getValue();
    }

    static Executor A06(F0C f0c) {
        return (Executor) f0c.getValue();
    }
}
