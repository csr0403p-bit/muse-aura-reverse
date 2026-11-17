package X;

import com.facebook.pando.NodeStoreJNI;
import com.google.common.collect.ImmutableList;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class Db2 extends AbstractC7559F3s implements Function0 {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Db2(C5123Da7 c5123Da7, NodeStoreJNI nodeStoreJNI, String str, int i) {
        super(0);
        this.$t = i;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 16:
                this.A02 = str;
                this.A01 = nodeStoreJNI;
                this.A00 = c5123Da7;
                break;
            case 3:
            case 9:
            case 12:
            case 14:
            default:
                this.A01 = nodeStoreJNI;
                this.A00 = c5123Da7;
                this.A02 = str;
                break;
        }
    }

    public static Object A00(C5123Da7 c5123Da7, C2428BbE c2428BbE, NodeStoreJNI nodeStoreJNI, String str, int i) {
        return nodeStoreJNI.cachedValue(c2428BbE, new Db2(c5123Da7, nodeStoreJNI, str, i));
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [com.google.common.collect.ImmutableList, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Boolean, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v21, types: [com.google.common.collect.ImmutableList, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Boolean, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Boolean, java.lang.Character] */
    /* JADX WARN: Type inference failed for: r2v28, types: [com.google.common.collect.ImmutableList, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r2v31, types: [X.Da7, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Boolean, java.lang.Character] */
    /* JADX WARN: Type inference failed for: r2v37, types: [com.google.common.collect.ImmutableList, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Boolean, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v44, types: [com.google.common.collect.ImmutableList, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.lang.Boolean, java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.common.collect.ImmutableList, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Boolean, java.lang.Double] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Boolean, java.lang.Character] */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException, SSLPeerUnverifiedException {
        switch (this.$t) {
            case 0:
                String str = this.A02;
                NodeStoreJNI nodeStoreJNI = (NodeStoreJNI) this.A01;
                return nodeStoreJNI.decodeBooleanField(nodeStoreJNI.booleanFieldNative(((C5123Da7) this.A00).A00, str));
            case 1:
                return ((NodeStoreJNI) this.A01).booleanListFieldNative(((C5123Da7) this.A00).A00, this.A02);
            case 2:
                String str2 = this.A02;
                NodeStoreJNI nodeStoreJNI2 = (NodeStoreJNI) this.A01;
                C5123Da7 c5123Da7 = (C5123Da7) this.A00;
                return nodeStoreJNI2.decodeDoubleField(nodeStoreJNI2.doubleFieldNative(c5123Da7.A00, str2), new Db2(c5123Da7, nodeStoreJNI2, str2, 3));
            case 3:
                return Character.valueOf(((NodeStoreJNI) this.A01).fieldStateNative(((C5123Da7) this.A00).A00, this.A02, 'd'));
            case 4:
                return ((NodeStoreJNI) this.A01).doubleListFieldNative(((C5123Da7) this.A00).A00, this.A02);
            case 5:
                return Boolean.valueOf(((NodeStoreJNI) this.A01).fieldIsSetNative(((C5123Da7) this.A00).A00, this.A02));
            case 6:
                String str3 = this.A02;
                NodeStoreJNI nodeStoreJNI3 = (NodeStoreJNI) this.A01;
                return nodeStoreJNI3.decodeIntField(nodeStoreJNI3.intFieldNative(((C5123Da7) this.A00).A00, str3));
            case 7:
                return ((NodeStoreJNI) this.A01).intListFieldNative(((C5123Da7) this.A00).A00, this.A02);
            case 8:
                String str4 = this.A02;
                NodeStoreJNI nodeStoreJNI4 = (NodeStoreJNI) this.A01;
                C5123Da7 c5123Da72 = (C5123Da7) this.A00;
                return nodeStoreJNI4.decodeLongField(nodeStoreJNI4.longFieldNative(c5123Da72.A00, str4), new Db2(c5123Da72, nodeStoreJNI4, str4, 9));
            case 9:
                return Character.valueOf(((NodeStoreJNI) this.A01).fieldStateNative(((C5123Da7) this.A00).A00, this.A02, 'l'));
            case 10:
                return ((NodeStoreJNI) this.A01).longListFieldNative(((C5123Da7) this.A00).A00, this.A02);
            case 11:
                String str5 = this.A02;
                NodeStoreJNI nodeStoreJNI5 = (NodeStoreJNI) this.A01;
                C5123Da7 c5123Da73 = (C5123Da7) this.A00;
                Long lDecodeNodeKey = nodeStoreJNI5.decodeNodeKey(nodeStoreJNI5.nodeFieldNative(c5123Da73.A00, str5), new Db2(c5123Da73, nodeStoreJNI5, str5, 12));
                if (lDecodeNodeKey != null) {
                    return nodeStoreJNI5.node$fbandroid_libraries_pando_graphql_pando_graphql(lDecodeNodeKey.longValue());
                }
                return null;
            case 12:
                return Character.valueOf(((NodeStoreJNI) this.A01).fieldStateNative(((C5123Da7) this.A00).A00, this.A02, 'o'));
            case 13:
                String str6 = this.A02;
                NodeStoreJNI nodeStoreJNI6 = (NodeStoreJNI) this.A01;
                ImmutableList immutableListNodeListFieldNative = nodeStoreJNI6.nodeListFieldNative(((C5123Da7) this.A00).A00, str6);
                if (immutableListNodeListFieldNative != null) {
                    return nodeStoreJNI6.mapToNodes(immutableListNodeListFieldNative);
                }
                return null;
            case 14:
                return ((G0U) this.A00).invoke(this.A01);
            case 15:
                return ((NodeStoreJNI) this.A01).stringFieldNative(((C5123Da7) this.A00).A00, this.A02);
            case 16:
                return ((NodeStoreJNI) this.A01).stringListFieldNative(((C5123Da7) this.A00).A00, this.A02);
            default:
                AbstractC6792Ea1 abstractC6792Ea1 = ((C6787EZw) this.A01).A01;
                List<Certificate> listA00 = (List) this.A00;
                if (abstractC6792Ea1 != null) {
                    listA00 = abstractC6792Ea1.A00(listA00, this.A02);
                }
                ?? A0i = AnonymousClass003.A0i(listA00);
                Iterator<Certificate> it = listA00.iterator();
                while (it.hasNext()) {
                    BV6.A1S(A0i, it);
                }
                return A0i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Db2(Object obj, Object obj2, String str, int i) {
        super(0);
        this.$t = i;
        this.A02 = str;
        this.A00 = obj2;
        this.A01 = obj;
    }
}
