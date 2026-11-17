package com.facebook.aura.maps;

import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.executors.AuraExecutors;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchRetainedMapRegistryKt {
    public static final void onUiThread(final Function0<Unit> function0) {
        if (C3cH.A1K()) {
            function0.invoke();
        } else {
            AuraExecutors.INSTANCE.getUiThreadHandler().post(new Runnable(function0) { // from class: com.facebook.aura.maps.HatchRetainedMapRegistryKt$sam$java_lang_Runnable$0
                public final /* synthetic */ Function0 function;

                {
                    C7384Etj.A0Y(function0, 0);
                    this.function = function0;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.function.invoke();
                }
            });
        }
    }
}
