package X;

import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.source.MergingMediaSource$IllegalMergeException;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.CompactHashMap;
import com.google.common.collect.MultimapBuilder$ArrayListSupplier;
import com.google.common.collect.Multimaps$CustomListMultimap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.Dld, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5598Dld extends AbstractC6010Dtt<Integer> {
    public static final C5704Dnm A09;
    public MergingMediaSource$IllegalMergeException A01;
    public final InterfaceC5023DOs<Object, C6001Dtk> A03;
    public final ArrayList<InterfaceC6009Dts> A04;
    public final Timeline[] A06;
    public final InterfaceC5512Djo A07;
    public final InterfaceC6009Dts[] A08;
    public int A00 = -1;
    public long[][] A02 = new long[0][];
    public final Map<Object, Long> A05 = BV4.A0u();

    static {
        C5608Dln c5608Dln = new C5608Dln();
        c5608Dln.A05 = "MergingMediaSource";
        A09 = c5608Dln.A00();
    }

    @Override // X.InterfaceC6009Dts
    public final InterfaceC6006Dtp A7x(Dy6 dy6, InterfaceC5538DkF interfaceC5538DkF, long j) {
        InterfaceC6009Dts[] interfaceC6009DtsArr = this.A08;
        int length = interfaceC6009DtsArr.length;
        InterfaceC6006Dtp[] interfaceC6006DtpArr = new InterfaceC6006Dtp[length];
        Timeline[] timelineArr = this.A06;
        int iA06 = timelineArr[0].A06(dy6.A04);
        for (int i = 0; i < length; i++) {
            interfaceC6006DtpArr[i] = interfaceC6009DtsArr[i].A7x(dy6.A01(timelineArr[i].A0C(iA06)), interfaceC5538DkF, j - this.A02[iA06][i]);
        }
        return new C5498Dja(this.A07, this.A02[iA06], interfaceC6006DtpArr);
    }

    @Override // X.InterfaceC6009Dts
    public final C5704Dnm AHb() {
        InterfaceC6009Dts[] interfaceC6009DtsArr = this.A08;
        return interfaceC6009DtsArr.length > 0 ? interfaceC6009DtsArr[0].AHb() : A09;
    }

    @Override // X.AbstractC6010Dtt, X.InterfaceC6009Dts
    public final void AQS() throws MergingMediaSource$IllegalMergeException {
        MergingMediaSource$IllegalMergeException mergingMediaSource$IllegalMergeException = this.A01;
        if (mergingMediaSource$IllegalMergeException != null) {
            throw mergingMediaSource$IllegalMergeException;
        }
        super.AQS();
    }

    @Override // X.InterfaceC6009Dts
    public final void AaI(InterfaceC6006Dtp interfaceC6006Dtp) {
        C5498Dja c5498Dja = (C5498Dja) interfaceC6006Dtp;
        int i = 0;
        while (true) {
            InterfaceC6009Dts[] interfaceC6009DtsArr = this.A08;
            if (i >= interfaceC6009DtsArr.length) {
                return;
            }
            InterfaceC6009Dts interfaceC6009Dts = interfaceC6009DtsArr[i];
            InterfaceC6006Dtp interfaceC6006Dtp2 = c5498Dja.A04[i];
            if (interfaceC6006Dtp2 instanceof C6002Dtl) {
                interfaceC6006Dtp2 = ((C6002Dtl) interfaceC6006Dtp2).A01;
            }
            interfaceC6009Dts.AaI(interfaceC6006Dtp2);
            i++;
        }
    }

    public C5598Dld(InterfaceC5512Djo interfaceC5512Djo, InterfaceC6009Dts... interfaceC6009DtsArr) {
        this.A08 = interfaceC6009DtsArr;
        this.A07 = interfaceC5512Djo;
        this.A04 = BV4.A0t(Arrays.asList(interfaceC6009DtsArr));
        this.A06 = new Timeline[interfaceC6009DtsArr.length];
        CompactHashMap compactHashMap = new CompactHashMap(8);
        MultimapBuilder$ArrayListSupplier multimapBuilder$ArrayListSupplier = new MultimapBuilder$ArrayListSupplier();
        Multimaps$CustomListMultimap multimaps$CustomListMultimap = new Multimaps$CustomListMultimap();
        Preconditions.checkArgument(compactHashMap.isEmpty());
        ((AbstractMapBasedMultimap) multimaps$CustomListMultimap).A01 = compactHashMap;
        multimaps$CustomListMultimap.A00 = multimapBuilder$ArrayListSupplier;
        this.A03 = multimaps$CustomListMultimap;
    }

    @Override // X.AbstractC6010Dtt, X.AbstractC6011Dtu
    public final void A0B() {
        super.A0B();
        Arrays.fill(this.A06, (Object) null);
        this.A00 = -1;
        this.A01 = null;
        ArrayList<InterfaceC6009Dts> arrayList = this.A04;
        arrayList.clear();
        Collections.addAll(arrayList, this.A08);
    }

    @Override // X.AbstractC6010Dtt, X.AbstractC6011Dtu
    public final void A0C(CXB cxb) {
        super.A0C(cxb);
        int i = 0;
        while (true) {
            InterfaceC6009Dts[] interfaceC6009DtsArr = this.A08;
            if (i >= interfaceC6009DtsArr.length) {
                return;
            }
            A0D(interfaceC6009DtsArr[i], Integer.valueOf(i));
            i++;
        }
    }
}
