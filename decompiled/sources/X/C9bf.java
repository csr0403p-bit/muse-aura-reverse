package X;

import android.util.Base64;
import com.facebook.aura.network.acs.AcsProofJson;
import com.facebook.aura.network.acs.HatchAcsTokenFetcher;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: X.9bf, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9bf {
    public static final String TAG = "ACSTokenFetcherBase";

    public abstract void fetchACSTokensFromServer(A7u a7u, ImmutableList<String> immutableList, InterfaceC07659bc<IEvaluation, IProof> interfaceC07659bc);

    public abstract String getCFromProof(IProof iproof);

    public void getCredentials(A7u a7u, byte[][] bArr, boolean z, C9bg c9bg) {
        boolean zA1b = AnonymousClass004.A1b(a7u, bArr);
        C7384Etj.A0Y(c9bg, 3);
        getCredentials(a7u, bArr, z, zA1b, c9bg);
    }

    public abstract String getDataFromEvaluation(IEvaluation ievaluation);

    public abstract String getSFromProof(IProof iproof);

    public static void A00(String str, Object obj) {
        ((A8B) obj).A00.A02.onFailure(new Throwable(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final C9bh decodeDleqProof(IProof iproof) {
        String sFromProof;
        HatchAcsTokenFetcher hatchAcsTokenFetcher = (HatchAcsTokenFetcher) this;
        AcsProofJson acsProofJson = (AcsProofJson) iproof;
        String cFromProof = hatchAcsTokenFetcher.getCFromProof(acsProofJson);
        if (cFromProof == null || (sFromProof = hatchAcsTokenFetcher.getSFromProof(acsProofJson)) == null) {
            return null;
        }
        Charset charset = DCl.A05;
        byte[] bArrDecode = Base64.decode(cFromProof.getBytes(charset), 8);
        byte[] bArrDecode2 = Base64.decode(sFromProof.getBytes(charset), 8);
        C9bh c9bh = new C9bh();
        c9bh.A00 = bArrDecode;
        c9bh.A01 = bArrDecode2;
        return c9bh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleBatchedProofCredentials(List<? extends IProof> list, byte[][] bArr, C9bg c9bg) {
        if (list.isEmpty()) {
            A00("Expected batched proof but received empty proof list", c9bg);
            return;
        }
        if (list.size() > 1) {
            A00(FGI.A0I("Expected exactly one batched proof but received ", list.size(), " proofs"), c9bg);
            return;
        }
        C9bh c9bhDecodeDleqProof = decodeDleqProof(C8j4.A0p(list));
        if (c9bhDecodeDleqProof == null) {
            A00("Empty batched proofResult", c9bg);
        } else {
            c9bg.AWO(new C9bh[]{c9bhDecodeDleqProof}, bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePerTokenProofCredentials(List<? extends IProof> list, byte[][] bArr, C9bg c9bg) {
        C9bh[] c9bhArr = new C9bh[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C9bh c9bhDecodeDleqProof = decodeDleqProof(list.get(i));
            c9bhArr[i] = c9bhDecodeDleqProof;
            if (c9bhDecodeDleqProof == null) {
                A00("Empty proofResult", c9bg);
                return;
            }
        }
        c9bg.AWO(c9bhArr, bArr);
    }

    public void fetchACSTokensFromServer(A7u a7u, ImmutableList<String> immutableList, boolean z, InterfaceC07659bc<IEvaluation, IProof> interfaceC07659bc) {
        AnonymousClass005.A0y(a7u, immutableList, interfaceC07659bc);
        fetchACSTokensFromServer(a7u, immutableList, interfaceC07659bc);
    }

    public void getCredentials(A7u a7u, byte[][] bArr, boolean z, boolean z2, C9bg c9bg) {
        String strA0z;
        AnonymousClass003.A0u(a7u, bArr);
        C7384Etj.A0Y(c9bg, 4);
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (byte[] bArr2 : bArr) {
            String strEncodeToString = Base64.encodeToString(bArr2, 8);
            if (strEncodeToString != null && (strA0z = AbstractC2159Azp.A0z(strEncodeToString, PairsDiscretionDocument.TERMINATOR, "")) != null) {
                builder.add((ImmutableList.Builder) strA0z);
            }
        }
        ImmutableList<String> immutableListBuild = builder.build();
        C7384Etj.A0U(immutableListBuild);
        fetchACSTokensFromServer(a7u, immutableListBuild, new C9be(c9bg, this, z2, z));
    }
}
