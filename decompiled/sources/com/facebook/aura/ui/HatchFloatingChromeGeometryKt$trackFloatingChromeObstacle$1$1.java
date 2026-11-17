package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.BLU;
import X.C0981AMm;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes.dex */
public final class HatchFloatingChromeGeometryKt$trackFloatingChromeObstacle$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C0981AMm<Object, BLU> $bounds;
    public final /* synthetic */ Object $owner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFloatingChromeGeometryKt$trackFloatingChromeObstacle$1$1(C0981AMm<Object, BLU> c0981AMm, Object obj) {
        super(1);
        this.$bounds = c0981AMm;
        this.$owner = obj;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final C0981AMm<Object, BLU> c0981AMm = this.$bounds;
        final Object obj = this.$owner;
        return new C78g() { // from class: com.facebook.aura.ui.HatchFloatingChromeGeometryKt$trackFloatingChromeObstacle$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                c0981AMm.remove(obj);
            }
        };
    }
}
