package com.facebook.aura.ui;

import X.AEk;
import X.AHD;
import X.AOB;
import X.AOP;
import X.AOQ;
import X.AOR;
import X.AOW;
import X.AVd;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00q;
import X.C00r;
import X.C0981AMm;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C31w;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G2j;
import X.G2k;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class ReorderableColumnKt {

    /* renamed from: com.facebook.aura.ui.ReorderableColumnKt$ReorderableColumn$9, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass9 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0U<Integer, Boolean> $canOpenRoomAt;
        public final /* synthetic */ Function0<Boolean> $collapseDragSlot;
        public final /* synthetic */ Function0<Float> $dragTranslationY;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ G2k<T, Boolean, BRg, BFM, Integer, Unit> $itemContent;
        public final /* synthetic */ G2j<Integer, BRg, BFM, Integer, Unit> $itemDecoration;
        public final /* synthetic */ AHD<T> $items;
        public final /* synthetic */ G0U<T, Object> $key;
        public final /* synthetic */ boolean $makeRoomOnDwell;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Integer, Unit> $onDragCancelled;
        public final /* synthetic */ G0U<Integer, Boolean> $onDragReleased;
        public final /* synthetic */ G0V<Integer, DraggedRowPosition, Boolean> $onDragStarted;
        public final /* synthetic */ G0V<Integer, DraggedRowPosition, Unit> $onDraggedRowMoved;
        public final /* synthetic */ Function0<Unit> $onRoomOpened;
        public final /* synthetic */ G0U<Integer, Boolean> $openRoomAboveDecorationAt;
        public final /* synthetic */ G0U<Integer, Integer> $resolveDropIndex;
        public final /* synthetic */ Object $retainedDragKey;
        public final /* synthetic */ long $roomOpenDelayMs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass9(AHD<? extends T> ahd, G0U<? super T, ? extends Object> g0u, boolean z, G0V<? super Integer, ? super DraggedRowPosition, Boolean> g0v, G0V<? super Integer, ? super DraggedRowPosition, Unit> g0v2, G0U<? super Integer, Boolean> g0u2, G0U<? super Integer, Unit> g0u3, Object obj, Function0<Float> function0, Function0<Boolean> function02, BRg bRg, boolean z2, long j, Function0<Unit> function03, G0U<? super Integer, Boolean> g0u4, G0U<? super Integer, Integer> g0u5, G0U<? super Integer, Boolean> g0u6, G2j<? super Integer, ? super BRg, ? super BFM, ? super Integer, Unit> g2j, G2k<? super T, ? super Boolean, ? super BRg, ? super BFM, ? super Integer, Unit> g2k, int i, int i2, int i3) {
            super(2);
            this.$items = ahd;
            this.$key = g0u;
            this.$enabled = z;
            this.$onDragStarted = g0v;
            this.$onDraggedRowMoved = g0v2;
            this.$onDragReleased = g0u2;
            this.$onDragCancelled = g0u3;
            this.$retainedDragKey = obj;
            this.$dragTranslationY = function0;
            this.$collapseDragSlot = function02;
            this.$modifier = bRg;
            this.$makeRoomOnDwell = z2;
            this.$roomOpenDelayMs = j;
            this.$onRoomOpened = function03;
            this.$canOpenRoomAt = g0u4;
            this.$resolveDropIndex = g0u5;
            this.$openRoomAboveDecorationAt = g0u6;
            this.$itemDecoration = g2j;
            this.$itemContent = g2k;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ReorderableColumnKt.ReorderableColumn(this.$items, this.$key, this.$enabled, this.$onDragStarted, this.$onDraggedRowMoved, this.$onDragReleased, this.$onDragCancelled, this.$retainedDragKey, this.$dragTranslationY, this.$collapseDragSlot, this.$modifier, this.$makeRoomOnDwell, this.$roomOpenDelayMs, this.$onRoomOpened, this.$canOpenRoomAt, this.$resolveDropIndex, this.$openRoomAboveDecorationAt, this.$itemDecoration, this.$itemContent, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> movedIntoSlotOf(List<? extends T> list, T t, T t2) {
        C7384Etj.A0Y(list, 0);
        int iIndexOf = list.indexOf(t);
        int iIndexOf2 = list.indexOf(t2);
        if (iIndexOf < 0 || iIndexOf2 < 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(iIndexOf2, arrayList.remove(iIndexOf));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> X.AHD<X.BHP> rememberMoveAccessibilityActions(T r6, java.util.List<? extends T> r7, java.lang.String r8, java.lang.String r9, X.G0U<? super T, kotlin.Unit> r10, X.BFM r11, int r12) {
        /*
            r0 = 1
            X.AnonymousClass005.A11(r7, r8, r9, r0)
            r1 = 4
            X.C7384Etj.A0Y(r10, r1)
            androidx.compose.runtime.MutableState r4 = X.C1er.A00(r11, r10)
            r0 = r12 & 14
            r0 = r0 ^ 6
            r5 = 0
            if (r0 <= r1) goto L19
            boolean r0 = r11.A65(r6)
            if (r0 != 0) goto L1e
        L19:
            r0 = r12 & 6
            r3 = 0
            if (r0 != r1) goto L1f
        L1e:
            r3 = 1
        L1f:
            r0 = r12 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r2 = 32
            if (r0 <= r2) goto L2d
            boolean r0 = r11.A65(r7)
            if (r0 != 0) goto L32
        L2d:
            r1 = r12 & 48
            r0 = 0
            if (r1 != r2) goto L33
        L32:
            r0 = 1
        L33:
            r3 = r3 | r0
            r0 = r12 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 <= r2) goto L42
            boolean r0 = r11.A65(r8)
            if (r0 != 0) goto L47
        L42:
            r1 = r12 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r2) goto L48
        L47:
            r0 = 1
        L48:
            r3 = r3 | r0
            r0 = r12 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 ^ 3072(0xc00, float:4.305E-42)
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 <= r1) goto L57
            boolean r0 = r11.A65(r9)
            if (r0 != 0) goto L5b
        L57:
            r0 = r12 & 3072(0xc00, float:4.305E-42)
            if (r0 != r1) goto L5c
        L5b:
            r5 = 1
        L5c:
            r3 = r3 | r5
            java.lang.Object r1 = r11.AaT()
            if (r3 != 0) goto L67
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L9b
        L67:
            int r3 = r7.indexOf(r6)
            X.AII r2 = X.AIM.A17()
            if (r3 <= 0) goto L9e
            com.facebook.aura.ui.ReorderableColumnKt$rememberMoveAccessibilityActions$1$1$1 r1 = new com.facebook.aura.ui.ReorderableColumnKt$rememberMoveAccessibilityActions$1$1$1
            r1.<init>(r7, r3, r4)
            X.BHP r0 = new X.BHP
            r0.<init>(r8, r1)
            r2.add(r0)
        L7e:
            int r0 = r7.size()
            int r0 = r0 + (-1)
            if (r3 >= r0) goto L93
            com.facebook.aura.ui.ReorderableColumnKt$rememberMoveAccessibilityActions$1$1$2 r1 = new com.facebook.aura.ui.ReorderableColumnKt$rememberMoveAccessibilityActions$1$1$2
            r1.<init>(r7, r3, r4)
            X.BHP r0 = new X.BHP
            r0.<init>(r9, r1)
            r2.add(r0)
        L93:
            X.AII r0 = X.AIM.A18(r2)
            X.AHD r1 = X.AnonymousClass001.A0z(r11, r0)
        L9b:
            X.AHD r1 = (X.AHD) r1
            return r1
        L9e:
            if (r3 < 0) goto L93
            goto L7e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.ReorderableColumnKt.rememberMoveAccessibilityActions(java.lang.Object, java.util.List, java.lang.String, java.lang.String, X.G0U, X.BFM, int):X.AHD");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: reorderableItemElevation-6a0pyJM, reason: not valid java name */
    public static final BRg m2332reorderableItemElevation6a0pyJM(BRg bRg, boolean z, float f, BFM bfm, int i, int i2) {
        BBI bbiA0M;
        Object objA09;
        float f2 = f;
        C7384Etj.A0Y(bRg, 0);
        if ((i2 & 2) != 0) {
            f2 = 12.0f;
        }
        final AOP aopA04 = AOR.A04(bfm, Boolean.valueOf(z), "reorderableItemPickUp", ((i >> 3) & 14) | 48);
        ReorderableColumnKt$reorderableItemElevation6a0pyJM$$inlined$animateFloat$1 reorderableColumnKt$reorderableItemElevation6a0pyJM$$inlined$animateFloat$1 = ReorderableColumnKt$reorderableItemElevation6a0pyJM$$inlined$animateFloat$1.INSTANCE;
        C31w<Float, AOW> c31w = AVd.A02;
        if (aopA04.A0G()) {
            bbiA0M = AnonymousClass002.A0M(bfm, 1666827533);
            objA09 = aopA04.A02.A09();
        } else {
            boolean zA1Y = AnonymousClass001.A1Y(aopA04, bfm, 1666573488);
            objA09 = bfm.AaT();
            if (zA1Y || objA09 == C78N.A00) {
                Snapshot snapshotA03 = Snapshot.A03();
                G0U<Object, Unit> g0uA0D = snapshotA03 != null ? snapshotA03.A0D() : null;
                Snapshot snapshotA04 = Snapshot.A04(snapshotA03);
                try {
                    objA09 = AnonymousClass007.A0S(aopA04, bfm, snapshotA03, snapshotA04, g0uA0D);
                } catch (Throwable th) {
                    Snapshot.A07(snapshotA03, snapshotA04, g0uA0D);
                    throw th;
                }
            }
            bbiA0M = C3cG.A07(bfm);
        }
        boolean zA1X = AnonymousClass001.A1X(objA09);
        bfm.AgE(1218547649);
        Float fA0b = AnonymousClass005.A0b(bbiA0M, AnonymousClass006.A00(zA1X ? 1 : 0));
        boolean zA65 = bfm.A65(aopA04);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = AnonymousClass003.A0R(bfm, new Function0<Boolean>() { // from class: com.facebook.aura.ui.ReorderableColumnKt$reorderableItemElevation-6a0pyJM$$inlined$animateFloat$2
                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return aopA04.A07.getValue();
                }
            });
        }
        boolean zA0F = C1BO.A0F((C1BO) objAaT);
        bfm.AgE(1218547649);
        Float fA0b2 = AnonymousClass005.A0b(bbiA0M, AnonymousClass006.A00(zA0F ? 1 : 0));
        boolean zA652 = bfm.A65(aopA04);
        Object objAaT2 = bfm.AaT();
        if (zA652 || objAaT2 == C78N.A00) {
            objAaT2 = AnonymousClass003.A0R(bfm, new Function0<AOB<Boolean>>() { // from class: com.facebook.aura.ui.ReorderableColumnKt$reorderableItemElevation-6a0pyJM$$inlined$animateFloat$3
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final AOB<Boolean> invoke() {
                    return aopA04.A03();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ AOB<Boolean> invoke() {
                    return aopA04.A03();
                }
            });
        }
        AOQ aoqA01 = AOR.A01(reorderableColumnKt$reorderableItemElevation6a0pyJM$$inlined$animateFloat$1.invoke((AOB<Boolean>) ((C1BO) objAaT2).getValue(), bfm, (Integer) 0), aopA04, c31w, bfm, fA0b, fA0b2, 196608);
        C1D3 c1d3A00 = C1D8.A00(f2);
        long j = C3cH.A0W(bfm).elevated;
        boolean zA1K = AnonymousClass003.A1K(bfm, aoqA01, c1d3A00);
        Object objAaT3 = bfm.AaT();
        if (zA1K || objAaT3 == C78N.A00) {
            objAaT3 = new ReorderableColumnKt$reorderableItemElevation$1$1(c1d3A00, aoqA01);
            bfm.Ai0(objAaT3);
        }
        BRg bRgA0W = AnonymousClass001.A0W(bRg, objAaT3);
        boolean zA653 = bfm.A65(aoqA01) | bfm.A64(j) | ((((i & 896) ^ 384) > 256 && bfm.A62(f2)) || (i & 384) == 256);
        Object objAaT4 = bfm.AaT();
        if (zA653 || objAaT4 == C78N.A00) {
            objAaT4 = new ReorderableColumnKt$reorderableItemElevation$2$1(j, f2, aoqA01);
            bfm.Ai0(objAaT4);
        }
        return AEk.A01(bRgA0W, (G0U) objAaT4);
    }

    public static final G0V<Integer, DraggedRowPosition, Boolean> ReorderableColumn$lambda$4(C1BO<? extends G0V<? super Integer, ? super DraggedRowPosition, Boolean>> c1bo) {
        return (G0V) c1bo.getValue();
    }

    public static final G0V<Integer, DraggedRowPosition, Unit> ReorderableColumn$lambda$5(C1BO<? extends G0V<? super Integer, ? super DraggedRowPosition, Unit>> c1bo) {
        return (G0V) c1bo.getValue();
    }

    public static final DraggedRowPosition ReorderableColumn$positionOf(C0981AMm<Object, Integer> c0981AMm, C0981AMm<Object, Integer> c0981AMm2, C1BO<? extends List<? extends Object>> c1bo, C1BO<? extends G0U<? super Integer, Integer>> c1bo2, Object obj, float f) {
        int i;
        Integer next;
        int iIndexOf = C3cG.A0l(c1bo).indexOf(obj);
        int iA03 = C3cJ.A03(c0981AMm, obj);
        ReorderableColumnKt$ReorderableColumn$positionOf$slotHeight$1 reorderableColumnKt$ReorderableColumn$positionOf$slotHeight$1 = new ReorderableColumnKt$ReorderableColumn$positionOf$slotHeight$1(c0981AMm2, c0981AMm);
        if (iIndexOf < 0) {
            i = iA03;
        } else {
            Iterator it = AbstractC0878AGe.A0Z(c1bo.getValue(), iIndexOf + 1).iterator();
            int iIntValue = 0;
            while (it.hasNext()) {
                iIntValue += reorderableColumnKt$ReorderableColumn$positionOf$slotHeight$1.invoke(it.next()).intValue();
            }
            i = iIntValue + iA03;
        }
        List<? extends Object> value = c1bo.getValue();
        int iIntValue2 = 0;
        int i2 = iIndexOf;
        if (iIndexOf < 0) {
            i2 = 0;
        }
        Iterator it2 = AbstractC0878AGe.A0a(value, i2).iterator();
        while (it2.hasNext()) {
            iIntValue2 += reorderableColumnKt$ReorderableColumn$positionOf$slotHeight$1.invoke(it2.next()).intValue();
        }
        float fA03 = iIntValue2 + C3cJ.A03(c0981AMm2, obj) + (iA03 / 2.0f) + f;
        Iterator<Integer> it3 = AbstractC0885AGm.A12(c1bo.getValue()).iterator();
        if (it3.hasNext()) {
            next = it3.next();
            if (it3.hasNext()) {
                Object obj2 = C3cG.A0l(c1bo).get(AnonymousClass001.A0F(next));
                int iA032 = C3cJ.A03(c0981AMm, obj2);
                int iA033 = C3cJ.A03(c0981AMm2, obj2);
                float fAbs = Math.abs((fA03 - iA033) - (iA032 / 2.0f));
                int i3 = iA033 + iA032;
                do {
                    Integer next2 = it3.next();
                    Object obj3 = C3cG.A0l(c1bo).get(AnonymousClass001.A0F(next2));
                    int iA034 = C3cJ.A03(c0981AMm, obj3);
                    int iA035 = i3 + C3cJ.A03(c0981AMm2, obj3);
                    float fAbs2 = Math.abs((fA03 - iA035) - (iA034 / 2.0f));
                    i3 = iA035 + iA034;
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        fAbs = fAbs2;
                        next = next2;
                    }
                } while (it3.hasNext());
            }
        } else {
            next = null;
        }
        Integer num = next;
        if (num != null) {
            iIndexOf = num.intValue();
        }
        return new DraggedRowPosition(i, iA03, f, AnonymousClass001.A0F(C1BO.A0B(c1bo2).invoke(Integer.valueOf(iIndexOf))));
    }

    public static final boolean ReorderableColumn$startDrag(MutableState<Object> mutableState, C1BO<? extends List<? extends Object>> c1bo, C1BO<? extends G0V<? super Integer, ? super DraggedRowPosition, Boolean>> c1bo2, C0981AMm<Object, Integer> c0981AMm, C0981AMm<Object, Integer> c0981AMm2, C1BO<? extends G0U<? super Integer, Integer>> c1bo3, C00r c00r, MutableState<Object> mutableState2, C00r c00r2, MutableState<List<Object>> mutableState3, C00q c00q, MutableState<Boolean> mutableState4, C00r c00r3, C00r c00r4, Object obj) {
        if (C7384Etj.areEqual(mutableState.getValue(), obj) || mutableState.getValue() != null) {
            return false;
        }
        int iIndexOf = C3cG.A0l(c1bo).indexOf(obj);
        boolean zA1X = AnonymousClass001.A1X(c1bo2.getValue().invoke(Integer.valueOf(iIndexOf), ReorderableColumn$positionOf(c0981AMm, c0981AMm2, c1bo, c1bo3, obj, 0.0f)));
        if (zA1X) {
            c00r.AdX(-1);
            mutableState2.Af8(null);
            c00r2.AdX(0);
            mutableState.Af8(obj);
            mutableState3.Af8(AbstractC0878AGe.A0X(c1bo.getValue()));
            c00q.AdS(0.0f);
            MutableState.A09(false, mutableState4);
            c00r3.AdX(iIndexOf);
            c00r4.AdX(-1);
        }
        return zA1X;
    }

    public static final /* synthetic */ G0V access$ReorderableColumn$lambda$5(C1BO c1bo) {
        return (G0V) c1bo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0176  */
    /* JADX WARN: Type inference failed for: r102v0, types: [X.BFM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v12, types: [com.facebook.aura.ui.ReorderableColumnKt$ReorderableColumn$$inlined$animateFloat$1] */
    /* JADX WARN: Type inference failed for: r28v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* JADX WARN: Type inference failed for: r8v61 */
    /* JADX WARN: Type inference failed for: r8v62, types: [X.G0U] */
    /* JADX WARN: Type inference failed for: r8v63, types: [X.G0U] */
    /* JADX WARN: Type inference failed for: r8v64, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v73 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void ReorderableColumn(X.AHD<? extends T> r82, X.G0U<? super T, ? extends java.lang.Object> r83, boolean r84, X.G0V<? super java.lang.Integer, ? super com.facebook.aura.ui.DraggedRowPosition, java.lang.Boolean> r85, X.G0V<? super java.lang.Integer, ? super com.facebook.aura.ui.DraggedRowPosition, kotlin.Unit> r86, X.G0U<? super java.lang.Integer, java.lang.Boolean> r87, X.G0U<? super java.lang.Integer, kotlin.Unit> r88, java.lang.Object r89, kotlin.jvm.functions.Function0<java.lang.Float> r90, kotlin.jvm.functions.Function0<java.lang.Boolean> r91, X.BRg r92, boolean r93, long r94, kotlin.jvm.functions.Function0<kotlin.Unit> r96, X.G0U<? super java.lang.Integer, java.lang.Boolean> r97, X.G0U<? super java.lang.Integer, java.lang.Integer> r98, X.G0U<? super java.lang.Integer, java.lang.Boolean> r99, X.G2j<? super java.lang.Integer, ? super X.BRg, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r100, X.G2k<? super T, ? super java.lang.Boolean, ? super X.BRg, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r101, X.BFM r102, int r103, int r104, int r105) {
        /*
            Method dump skipped, instructions count: 2018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.ReorderableColumnKt.ReorderableColumn(X.AHD, X.G0U, boolean, X.G0V, X.G0V, X.G0U, X.G0U, java.lang.Object, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, boolean, long, kotlin.jvm.functions.Function0, X.G0U, X.G0U, X.G0U, X.G2j, X.G2k, X.BFM, int, int, int):void");
    }
}
