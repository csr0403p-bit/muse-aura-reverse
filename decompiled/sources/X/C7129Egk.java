package X;

import android.graphics.Rect;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;

/* renamed from: X.Egk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7129Egk implements InterfaceC7153EhO {
    public final /* synthetic */ AnimatedFactoryV2Impl A00;

    @Override // X.InterfaceC7153EhO
    public final C7270Ejv AC4(Rect rect, EhK ehK) {
        C7384Etj.A0Y(ehK, 0);
        AnimatedFactoryV2Impl animatedFactoryV2Impl = this.A00;
        EhF ehF = animatedFactoryV2Impl.A05;
        if (ehF == null) {
            ehF = new EhF();
            animatedFactoryV2Impl.A05 = ehF;
        }
        return new C7270Ejv(rect, ehK, ehF, animatedFactoryV2Impl.A09);
    }

    public C7129Egk(AnimatedFactoryV2Impl animatedFactoryV2Impl) {
        this.A00 = animatedFactoryV2Impl;
    }
}
