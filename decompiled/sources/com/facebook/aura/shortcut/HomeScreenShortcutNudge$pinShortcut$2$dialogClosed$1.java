package com.facebook.aura.shortcut;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.C3Pi;
import X.C3UX;
import X.C3cG;
import X.C5303Dfm;
import X.EnumC10460Hji;
import X.EnumC10573Huf;
import X.F2N;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.shortcut.HomeScreenShortcutNudge$pinShortcut$2$dialogClosed$1", f = "HomeScreenShortcutNudge.kt", l = {136, 137}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HomeScreenShortcutNudge$pinShortcut$2$dialogClosed$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super EnumC10573Huf>, Object> {
    public final /* synthetic */ F2N $lifecycle;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.shortcut.HomeScreenShortcutNudge$pinShortcut$2$dialogClosed$1$1", f = "HomeScreenShortcutNudge.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shortcut.HomeScreenShortcutNudge$pinShortcut$2$dialogClosed$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<EnumC10573Huf, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10573Huf enumC10573Huf = (EnumC10573Huf) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return C3cG.A0P(enumC10573Huf.A00(EnumC10573Huf.A05));
        }

        @Override // X.G0V
        public final Object invoke(EnumC10573Huf enumC10573Huf, HtJ<? super Boolean> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.L$0 = enumC10573Huf;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shortcut.HomeScreenShortcutNudge$pinShortcut$2$dialogClosed$1$2", f = "HomeScreenShortcutNudge.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shortcut.HomeScreenShortcutNudge$pinShortcut$2$dialogClosed$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<EnumC10573Huf, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10573Huf enumC10573Huf = (EnumC10573Huf) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(enumC10573Huf.A00(EnumC10573Huf.A05));
        }

        @Override // X.G0V
        public final Object invoke(EnumC10573Huf enumC10573Huf, HtJ<? super Boolean> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = enumC10573Huf;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeScreenShortcutNudge$pinShortcut$2$dialogClosed$1(F2N f2n, HtJ<? super HomeScreenShortcutNudge$pinShortcut$2$dialogClosed$1> htJ) {
        super(2, htJ);
        this.$lifecycle = f2n;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HomeScreenShortcutNudge$pinShortcut$2$dialogClosed$1(this.$lifecycle, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C3Pi c3PiA11 = C3cG.A11(((C5303Dfm) this.$lifecycle).A06);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (AbstractC9777Gfy.A00(this, anonymousClass1, c3PiA11) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    Hwg.A00(obj);
                }
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        C3Pi c3PiA112 = C3cG.A11(((C5303Dfm) this.$lifecycle).A06);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
        this.label = 2;
        obj = AbstractC9777Gfy.A00(this, anonymousClass2, c3PiA112);
        return obj == enumC10460Hji ? enumC10460Hji : obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super EnumC10573Huf> htJ) {
        return new HomeScreenShortcutNudge$pinShortcut$2$dialogClosed$1(this.$lifecycle, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
