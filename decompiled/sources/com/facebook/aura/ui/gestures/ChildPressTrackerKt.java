package com.facebook.aura.ui.gestures;

import X.AGO;
import X.AKH;
import X.AaM;
import X.AbstractC07117nq;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BFM;
import X.BRg;
import X.BRr;
import X.C1299Agk;
import X.C2Uh;
import X.C7384Etj;
import X.C78N;
import X.EnumC10460Hji;
import X.EnumC1080AXj;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC1074AXb;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ChildPressTrackerKt {
    public static final AKH<ChildPressTracker> LocalChildPressTracker = new AGO(new Function0() { // from class: com.facebook.aura.ui.gestures.ChildPressTrackerKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return null;
        }
    });

    public static final BRg handlesChildPresses(BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        bfm.AgE(838408507);
        final ChildPressTracker childPressTracker = (ChildPressTracker) bfm.A6v(LocalChildPressTracker);
        if (childPressTracker != null) {
            boolean zA67 = bfm.A67(childPressTracker);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new PointerInputEventHandler() { // from class: com.facebook.aura.ui.gestures.ChildPressTrackerKt$handlesChildPresses$1$1

                    @DebugMetadata(c = "com.facebook.aura.ui.gestures.ChildPressTrackerKt$handlesChildPresses$1$1$1", f = "ChildPressTracker.kt", l = {36}, m = "invokeSuspend", v = 2)
                    /* renamed from: com.facebook.aura.ui.gestures.ChildPressTrackerKt$handlesChildPresses$1$1$1, reason: invalid class name */
                    public final class AnonymousClass1 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
                        public final /* synthetic */ ChildPressTracker $tracker;
                        public /* synthetic */ Object L$0;
                        public Object L$1;
                        public int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(ChildPressTracker childPressTracker, HtJ<? super AnonymousClass1> htJ) {
                            super(2, htJ);
                            this.$tracker = childPressTracker;
                        }

                        @Override // X.AbstractC8884Fsp
                        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$tracker, htJ);
                            anonymousClass1.L$0 = obj;
                            return anonymousClass1;
                        }

                        @Override // X.AbstractC8884Fsp
                        public final Object invokeSuspend(Object obj) {
                            ChildPressTracker childPressTracker;
                            InterfaceC1074AXb interfaceC1074AXb = (InterfaceC1074AXb) this.L$0;
                            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                            int i = this.label;
                            if (i == 0) {
                                Hwg.A00(obj);
                                childPressTracker = this.$tracker;
                                EnumC1080AXj enumC1080AXj = EnumC1080AXj.A03;
                                this.L$0 = null;
                                this.L$1 = childPressTracker;
                                this.label = 1;
                                obj = TapGestureDetectorKt.A04(interfaceC1074AXb, enumC1080AXj, this, false);
                                if (obj == enumC10460Hji) {
                                    return enumC10460Hji;
                                }
                            } else {
                                if (i != 1) {
                                    throw AnonymousClass001.A0n();
                                }
                                childPressTracker = (ChildPressTracker) this.L$1;
                                Hwg.A00(obj);
                            }
                            childPressTracker.claimedPointer = new C2Uh(((C1299Agk) obj).A08);
                            return Unit.INSTANCE;
                        }

                        @Override // X.G0V
                        public final Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
                            return ((AnonymousClass1) create(interfaceC1074AXb, htJ)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                        return AnonymousClass006.A0l(bRr, htJ, new AnonymousClass1(childPressTracker, null));
                    }
                };
                bfm.Ai0(objAaT);
            }
            bRg = AaM.A00(bRg, (PointerInputEventHandler) objAaT, childPressTracker);
        }
        AnonymousClass001.A1D(bfm);
        return bRg;
    }

    public static final ChildPressTracker LocalChildPressTracker$lambda$0() {
        return null;
    }

    public static final AKH<ChildPressTracker> getLocalChildPressTracker() {
        return LocalChildPressTracker;
    }

    public static final BRg longPressMediaTarget(BRg bRg, String str) {
        AnonymousClass003.A0u(bRg, str);
        return bRg.then(new LongPressMediaTargetElement(str));
    }
}
