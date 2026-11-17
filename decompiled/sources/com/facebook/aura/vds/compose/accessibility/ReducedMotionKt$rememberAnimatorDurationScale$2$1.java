package com.facebook.aura.vds.compose.accessibility;

import X.AbstractC7559F3s;
import X.C00q;
import X.C0Yr;
import X.C60O;
import X.C7384Etj;
import X.C78g;
import X.G0U;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes3.dex */
public final class ReducedMotionKt$rememberAnimatorDurationScale$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ ContentResolver $resolver;
    public final /* synthetic */ C00q $scale$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReducedMotionKt$rememberAnimatorDurationScale$2$1(ContentResolver contentResolver, C00q c00q) {
        super(1);
        this.$resolver = contentResolver;
        this.$scale$delegate = c00q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.database.ContentObserver, com.facebook.aura.vds.compose.accessibility.ReducedMotionKt$rememberAnimatorDurationScale$2$1$observer$1] */
    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final Handler handlerA02 = C60O.A02();
        final ContentResolver contentResolver = this.$resolver;
        final C00q c00q = this.$scale$delegate;
        final ?? r3 = new ContentObserver(handlerA02) { // from class: com.facebook.aura.vds.compose.accessibility.ReducedMotionKt$rememberAnimatorDurationScale$2$1$observer$1
            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                C00q c00q2 = c00q;
                ContentResolver contentResolver2 = contentResolver;
                C7384Etj.A0X(contentResolver2);
                c00q2.AdS(ReducedMotionKt.readAnimatorDurationScale(contentResolver2));
            }
        };
        this.$resolver.registerContentObserver(Settings.Global.getUriFor("animator_duration_scale"), false, r3);
        r3.onChange(false);
        final ContentResolver contentResolver2 = this.$resolver;
        return new C78g() { // from class: com.facebook.aura.vds.compose.accessibility.ReducedMotionKt$rememberAnimatorDurationScale$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                contentResolver2.unregisterContentObserver(r3);
            }
        };
    }
}
