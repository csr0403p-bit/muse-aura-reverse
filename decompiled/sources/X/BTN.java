package X;

import androidx.compose.foundation.gestures.UpdatableAnimationState;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class BTN implements Ht9, Function0 {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;

    public BTN(TextFieldSelectionState textFieldSelectionState, BO7 bo7, BO7 bo72, int i) {
        this.$t = i;
        this.A00 = bo7;
        switch (i) {
            case 5:
            case 8:
                this.A01 = textFieldSelectionState;
                this.A02 = bo72;
                break;
            case 6:
            case 7:
            default:
                this.A01 = bo72;
                this.A02 = textFieldSelectionState;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC1702Aoh interfaceC1702Aoh;
        AaC aaCInvoke;
        int i;
        int i2;
        switch (this.$t) {
            case 0:
                C1265AgA c1265AgA = (C1265AgA) this.A00;
                UpdatableAnimationState updatableAnimationState = (UpdatableAnimationState) this.A01;
                C3MW c3mw = (C3MW) this.A02;
                C1270AgF c1270AgF = c1265AgA.A07;
                while (true) {
                    C0910AHm<C1281AgR> c0910AHm = c1270AgF.A00;
                    int i3 = c0910AHm.A00;
                    if (i3 != 0) {
                        AaC aaCInvoke2 = c0910AHm.A01[i3 - 1].A00.invoke();
                        if (aaCInvoke2 != null) {
                            long j = c1265AgA.A00;
                            if (j == AbstractC1288AgY.A00) {
                                j = 0;
                            }
                            if (C1265AgA.A03(c1265AgA, aaCInvoke2, j, 0L)) {
                            }
                        }
                        c0910AHm.A07(c0910AHm.A00 - 1).A01.resumeWith(Unit.INSTANCE);
                    }
                }
                if (c1265AgA.A06 && (aaCInvoke = c1265AgA.A03.invoke()) != null) {
                    long j2 = c1265AgA.A00;
                    if (j2 == AbstractC1288AgY.A00) {
                        j2 = 0;
                    }
                    if (C1265AgA.A03(c1265AgA, aaCInvoke, j2, 0L)) {
                        c1265AgA.A06 = false;
                    }
                }
                updatableAnimationState.A00 = C1265AgA.A00(c3mw, c1265AgA, 0L);
                break;
            case 1:
                C1BO c1bo = (C1BO) this.A00;
                LazyListState lazyListState = (LazyListState) this.A01;
                C0AU c0au = (C0AU) this.A02;
                AdS adS = (AdS) c1bo.getValue();
                return new AdR(c0au, adS, lazyListState, new C1171Ada(adS, (ADq) lazyListState.A0B.A02.A01.getValue()));
            case 2:
                return new C1169AdU(C1BO.A0B((C1BO) this.A01), (G2j) ((C1BO) this.A00).getValue(), C8j4.A0I((Function0) this.A02));
            case 3:
                C1266AgB c1266AgB = (C1266AgB) this.A00;
                AaC aaCA00 = C1266AgB.A00(c1266AgB, (InterfaceC1497Ak4) this.A01, (Function0) this.A02);
                if (aaCA00 == null) {
                    return null;
                }
                C1265AgA c1265AgA2 = (C1265AgA) c1266AgB.A00;
                long j3 = c1265AgA2.A00;
                if (j3 == AbstractC1288AgY.A00) {
                    throw C3cG.A0Q("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return aaCA00.A03(C1265AgA.A01(c1265AgA2, aaCA00, j3, 0L) ^ (-9223372034707292160L));
            case 4:
                C1733ApU c1733ApU = (C1733ApU) this.A01;
                C0jP c0jP = (C0jP) this.A02;
                AbstractC1699Aoe abstractC1699Aoe = (AbstractC1699Aoe) c1733ApU.A02;
                if (abstractC1699Aoe instanceof C1ji) {
                    try {
                        c0jP.openUri(((C1ji) abstractC1699Aoe).A01);
                    } catch (IllegalArgumentException unused) {
                    }
                } else if ((abstractC1699Aoe instanceof BGe) && (interfaceC1702Aoh = ((BGe) abstractC1699Aoe).A00) != null) {
                    interfaceC1702Aoh.onClick(abstractC1699Aoe);
                }
                return Unit.INSTANCE;
            case 5:
            case 8:
            default:
                TextFieldSelectionState.A08((TextFieldSelectionState) this.A01, (BO7) this.A00, (BO7) this.A02);
                break;
            case 6:
            case 7:
                TextFieldSelectionState.A07((TextFieldSelectionState) this.A02, (BO7) this.A00, (BO7) this.A01);
                break;
            case 9:
                BCR bcr = (BCR) this.A00;
                BBJ bbj = (BBJ) this.A01;
                BCT bct = (BCT) this.A02;
                if (bcr != null) {
                    bbj.A0V(bbj.A0L(bcr) - bbj.A00);
                }
                List listA01 = BBZ.A01(bbj, null, bbj.A00);
                AH3 ah3 = (AH3) AbstractC0878AGe.A0I(listA01);
                Integer num = ah3 != null ? ah3.A01 : null;
                List listA5W = bct.A5W();
                if (num != null && !listA5W.isEmpty()) {
                    listA5W = AbstractC0878AGe.A0P(AbstractC0878AGe.A0Z(listA5W, 1), Collections.singletonList(new AH3(((AH3) AbstractC0878AGe.A0F(listA5W)).A00, num)));
                }
                return new C0904AHg(AbstractC0878AGe.A0P(listA5W, listA01), bct.AKo());
            case 10:
                B8s b8s = (B8s) this.A00;
                B8q b8q = (B8q) this.A01;
                F1E f1e = (F1E) this.A02;
                if (b8s instanceof C2270BQi) {
                    C2270BQi c2270BQi = (C2270BQi) b8s;
                    c2270BQi.A00 = null;
                    c2270BQi.A01 = null;
                } else {
                    ((C2240BCl) b8s).A00 = null;
                }
                C1726ApH c1726ApH = b8q.A03;
                int i4 = f1e.element;
                do {
                    i = c1726ApH.get();
                    i2 = i;
                    if (((i >>> 27) & 15) == i4) {
                        i2 = i - 1;
                    }
                } while (!c1726ApH.compareAndSet(i, i2));
            case 11:
                List list = (List) this.A00;
                AMP amp = (AMP) this.A01;
                Function0 function0 = (Function0) this.A02;
                int size = list.size() - amp.getPreviousEntries().size();
                for (int i5 = 0; i5 < size; i5++) {
                    function0.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public BTN(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }
}
