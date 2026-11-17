package com.facebook.aura.vds.compose.common;

import X.AaM;
import X.AbstractC07117nq;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BFM;
import X.BO7;
import X.BRg;
import X.BRr;
import X.C3UX;
import X.C7384Etj;
import X.C78N;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.InterfaceC1074AXb;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public abstract class DisableSplitMotionEventsModifierKt {
    public static final BRg disableSplitMotionEvents(BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        Unit unit = Unit.INSTANCE;
        Object objAaT = bfm.AaT();
        if (objAaT == C78N.A00) {
            objAaT = new PointerInputEventHandler() { // from class: com.facebook.aura.vds.compose.common.DisableSplitMotionEventsModifierKt$disableSplitMotionEvents$1$1

                @DebugMetadata(c = "com.facebook.aura.vds.compose.common.DisableSplitMotionEventsModifierKt$disableSplitMotionEvents$1$1$1", f = "DisableSplitMotionEventsModifier.kt", l = {24}, m = "invokeSuspend", v = 2)
                /* renamed from: com.facebook.aura.vds.compose.common.DisableSplitMotionEventsModifierKt$disableSplitMotionEvents$1$1$1, reason: invalid class name */
                public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
                    public final /* synthetic */ BRr $this_pointerInput;
                    public Object L$0;
                    public int label;

                    @DebugMetadata(c = "com.facebook.aura.vds.compose.common.DisableSplitMotionEventsModifierKt$disableSplitMotionEvents$1$1$1$1", f = "DisableSplitMotionEventsModifier.kt", l = {26}, m = "invokeSuspend", v = 2)
                    /* renamed from: com.facebook.aura.vds.compose.common.DisableSplitMotionEventsModifierKt$disableSplitMotionEvents$1$1$1$1, reason: invalid class name and collision with other inner class name */
                    public final class C04231 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
                        public final /* synthetic */ BO7 $currentId;
                        public /* synthetic */ Object L$0;
                        public int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C04231(BO7 bo7, HtJ<? super C04231> htJ) {
                            super(2, htJ);
                            this.$currentId = bo7;
                        }

                        @Override // X.AbstractC8884Fsp
                        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                            C04231 c04231 = new C04231(this.$currentId, htJ);
                            c04231.L$0 = obj;
                            return c04231;
                        }

                        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            */
                        /* JADX WARN: Removed duplicated region for block: B:25:0x0086 A[RETURN] */
                        /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0084 -> B:6:0x0010). Please report as a decompilation issue!!! */
                        @Override // X.AbstractC8884Fsp
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                            /*
                                r14 = this;
                                java.lang.Object r8 = r14.L$0
                                X.AXb r8 = (X.InterfaceC1074AXb) r8
                                X.Hji r7 = X.EnumC10460Hji.A02
                                int r0 = r14.label
                                r6 = 1
                                if (r0 == 0) goto L77
                                if (r0 != r6) goto L87
                                X.Hwg.A00(r15)
                            L10:
                                X.Afe r15 = (X.C1247Afe) r15
                                java.util.List<X.Agk> r0 = r15.A05
                                X.BO7 r10 = r14.$currentId
                                java.util.Iterator r13 = r0.iterator()
                            L1a:
                                boolean r0 = r13.hasNext()
                                if (r0 == 0) goto L7a
                                java.lang.Object r11 = r13.next()
                                X.Agk r11 = (X.C1299Agk) r11
                                boolean r0 = r11.A0F
                                r4 = -1
                                java.lang.String r9 = "Modifier.disableSplitMotionEvents"
                                long r2 = r10.element
                                if (r0 == 0) goto L46
                                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                                if (r0 != 0) goto L5c
                                long r0 = r11.A08
                                java.lang.String r3 = X.C2Uh.A00(r0)
                                java.lang.String r2 = "Touch event received with id: "
                                java.lang.String r2 = X.FGI.A0M(r2, r3)
                                X.CFK.A05(r9, r2)
                                r10.element = r0
                                goto L1a
                            L46:
                                long r0 = r11.A08
                                int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                                if (r12 != 0) goto L5c
                                java.lang.String r1 = X.C2Uh.A00(r0)
                                java.lang.String r0 = "Touch event released with id: "
                                java.lang.String r0 = X.FGI.A0M(r0, r1)
                                X.CFK.A05(r9, r0)
                                r10.element = r4
                                goto L1a
                            L5c:
                                long r0 = r11.A08
                                int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                                if (r12 == 0) goto L1a
                                int r12 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                                if (r12 == 0) goto L1a
                                java.lang.String r1 = X.C2Uh.A00(r0)
                                java.lang.String r0 = "Touch event ignored with id: "
                                java.lang.String r0 = X.FGI.A0M(r0, r1)
                                X.CFK.A05(r9, r0)
                                r11.A02()
                                goto L1a
                            L77:
                                X.Hwg.A00(r15)
                            L7a:
                                X.AXj r0 = X.EnumC1080AXj.A03
                                r14.L$0 = r8
                                r14.label = r6
                                java.lang.Object r15 = r8.A4z(r0, r14)
                                if (r15 != r7) goto L10
                                return r7
                            L87:
                                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                                throw r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.common.DisableSplitMotionEventsModifierKt$disableSplitMotionEvents$1$1.AnonymousClass1.C04231.invokeSuspend(java.lang.Object):java.lang.Object");
                        }

                        @Override // X.G0V
                        public final Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
                            return ((C04231) create(interfaceC1074AXb, htJ)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(BRr bRr, HtJ<? super AnonymousClass1> htJ) {
                        super(2, htJ);
                        this.$this_pointerInput = bRr;
                    }

                    @Override // X.AbstractC8884Fsp
                    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                        return new AnonymousClass1(this.$this_pointerInput, htJ);
                    }

                    @Override // X.AbstractC8884Fsp
                    public final Object invokeSuspend(Object obj) {
                        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                        int i = this.label;
                        if (i == 0) {
                            Hwg.A00(obj);
                            BO7 bo7 = new BO7();
                            bo7.element = -1L;
                            BRr bRr = this.$this_pointerInput;
                            C04231 c04231 = new C04231(bo7, null);
                            this.L$0 = null;
                            this.label = 1;
                            if (bRr.A50(c04231, this) == enumC10460Hji) {
                                return enumC10460Hji;
                            }
                        } else {
                            if (i != 1) {
                                throw AnonymousClass001.A0n();
                            }
                            Hwg.A00(obj);
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // X.G0V
                    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                        return new AnonymousClass1(this.$this_pointerInput, htJ).invokeSuspend(Unit.INSTANCE);
                    }
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                    Object objA00 = Hxb.A00(new AnonymousClass1(bRr, null), htJ);
                    return objA00 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA00;
                }
            };
            bfm.Ai0(objAaT);
        }
        return AaM.A00(bRg, (PointerInputEventHandler) objAaT, unit);
    }
}
