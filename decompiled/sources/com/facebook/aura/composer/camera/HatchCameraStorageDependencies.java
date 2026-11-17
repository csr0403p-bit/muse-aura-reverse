package com.facebook.aura.composer.camera;

import X.BYM;
import X.C7384Etj;
import X.C9v;
import X.ED7;
import X.ED8;
import X.EDB;
import X.EDT;
import X.EE6;
import X.F0C;
import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.aura.executors.AuraExecutors;
import java.io.File;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class HatchCameraStorageDependencies implements EDT, EE6, C9v {
    public static final int $stable = 8;
    public final SharedPreferences metadata;
    public final Executor serialExecutor;

    public HatchCameraStorageDependencies(Context context) {
        C7384Etj.A0Y(context, 0);
        this.metadata = context.getSharedPreferences("hatch_camera_storage", 0);
        int i = AuraExecutors.CORE_POOL_SIZE;
        this.serialExecutor = new AuraExecutors.SerialExecutor(F0C.A05());
    }

    @Override // X.C9v
    public boolean deletePath(File file) {
        C7384Etj.A0Y(file, 0);
        HatchCameraFiles.INSTANCE.revoke$fbandroid_express_aura_java_com_facebook_aura_composer_camera_camera(file);
        return EDB.A00(file);
    }

    @Override // X.EE6
    public ED8 getStore(String str) {
        C7384Etj.A0Y(str, 0);
        SharedPreferences sharedPreferences = this.metadata;
        C7384Etj.A0T(sharedPreferences);
        return new ED7(sharedPreferences, str);
    }

    public Executor createExecutor(BYM bym) {
        return this.serialExecutor;
    }

    @Override // X.EDT
    public Executor getExecutor(BYM bym) {
        return this.serialExecutor;
    }
}
