package X;

import com.facebook.tigon.iface.TigonRequest;
import com.facebook.tigon.tigonhuc.HucClient;
import com.facebook.tigon.tigonhuc.TigonHucBodyProvider;
import com.facebook.tigon.tigonhuc.TigonHucCallbackForwarder;

/* renamed from: X.CXa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC3607CXa implements Runnable {
    public static final String __redex_internal_original_name = "HucClient$startRequest$requestTask$1";
    public final /* synthetic */ TigonRequest A00;
    public final /* synthetic */ HucClient A01;
    public final /* synthetic */ TigonHucBodyProvider A02;
    public final /* synthetic */ TigonHucCallbackForwarder A03;

    public RunnableC3607CXa(TigonRequest tigonRequest, HucClient hucClient, TigonHucBodyProvider tigonHucBodyProvider, TigonHucCallbackForwarder tigonHucCallbackForwarder) {
        this.A00 = tigonRequest;
        this.A03 = tigonHucCallbackForwarder;
        this.A01 = hucClient;
        this.A02 = tigonHucBodyProvider;
    }

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0267: IGET (r3 I:com.facebook.tigon.tigonhuc.TigonHucCallbackForwarder) = (r8 I:X.CXa) (LINE:615) X.CXa.A03 com.facebook.tigon.tigonhuc.TigonHucCallbackForwarder, block:B:126:0x0267 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x028a: IGET (r3 I:com.facebook.tigon.tigonhuc.TigonHucCallbackForwarder) = (r8 I:X.CXa) (LINE:650) X.CXa.A03 com.facebook.tigon.tigonhuc.TigonHucCallbackForwarder, block:B:138:0x028a */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0227 A[Catch: all -> 0x0232, TRY_ENTER, TryCatch #3 {all -> 0x0232, blocks: (B:9:0x004d, B:11:0x0059, B:12:0x005a, B:14:0x0063, B:16:0x0067, B:18:0x0080, B:20:0x0087, B:21:0x008a, B:22:0x008f, B:23:0x0097, B:25:0x009f, B:27:0x00a7, B:29:0x00b9, B:30:0x00c3, B:31:0x00d1, B:39:0x00f9, B:43:0x0105, B:44:0x0108, B:48:0x0138, B:49:0x013c, B:109:0x022e, B:110:0x0231, B:42:0x0101, B:56:0x014d, B:58:0x0154, B:60:0x0158, B:62:0x015d, B:64:0x0163, B:108:0x0227, B:65:0x016d, B:67:0x0174, B:70:0x0183, B:71:0x0192, B:73:0x0198, B:75:0x01a2, B:76:0x01a6, B:77:0x01b7, B:79:0x01bd, B:81:0x01cf, B:82:0x01d3, B:83:0x01d7, B:84:0x01da, B:94:0x01fe, B:96:0x0207, B:100:0x0215, B:104:0x021c, B:95:0x0203, B:45:0x0118, B:47:0x012e, B:51:0x0141, B:97:0x020b, B:99:0x0211, B:102:0x021a), top: B:148:0x004d, inners: #0, #2, #7, #8, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0148 A[Catch: Exception -> 0x0237, IOException -> 0x0247, InterruptedException -> 0x0256, IllegalArgumentException -> 0x0276, MalformedURLException | ProtocolException -> 0x0289, TRY_LEAVE, TryCatch #5 {MalformedURLException | ProtocolException -> 0x0289, blocks: (B:3:0x0007, B:5:0x001e, B:7:0x003a, B:32:0x00d6, B:34:0x00dd, B:36:0x00ec, B:38:0x00f4, B:68:0x017f, B:54:0x0145, B:55:0x0148, B:105:0x0220, B:112:0x0233, B:113:0x0236), top: B:149:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0163 A[Catch: all -> 0x0232, TryCatch #3 {all -> 0x0232, blocks: (B:9:0x004d, B:11:0x0059, B:12:0x005a, B:14:0x0063, B:16:0x0067, B:18:0x0080, B:20:0x0087, B:21:0x008a, B:22:0x008f, B:23:0x0097, B:25:0x009f, B:27:0x00a7, B:29:0x00b9, B:30:0x00c3, B:31:0x00d1, B:39:0x00f9, B:43:0x0105, B:44:0x0108, B:48:0x0138, B:49:0x013c, B:109:0x022e, B:110:0x0231, B:42:0x0101, B:56:0x014d, B:58:0x0154, B:60:0x0158, B:62:0x015d, B:64:0x0163, B:108:0x0227, B:65:0x016d, B:67:0x0174, B:70:0x0183, B:71:0x0192, B:73:0x0198, B:75:0x01a2, B:76:0x01a6, B:77:0x01b7, B:79:0x01bd, B:81:0x01cf, B:82:0x01d3, B:83:0x01d7, B:84:0x01da, B:94:0x01fe, B:96:0x0207, B:100:0x0215, B:104:0x021c, B:95:0x0203, B:45:0x0118, B:47:0x012e, B:51:0x0141, B:97:0x020b, B:99:0x0211, B:102:0x021a), top: B:148:0x004d, inners: #0, #2, #7, #8, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0174 A[Catch: all -> 0x0232, TRY_LEAVE, TryCatch #3 {all -> 0x0232, blocks: (B:9:0x004d, B:11:0x0059, B:12:0x005a, B:14:0x0063, B:16:0x0067, B:18:0x0080, B:20:0x0087, B:21:0x008a, B:22:0x008f, B:23:0x0097, B:25:0x009f, B:27:0x00a7, B:29:0x00b9, B:30:0x00c3, B:31:0x00d1, B:39:0x00f9, B:43:0x0105, B:44:0x0108, B:48:0x0138, B:49:0x013c, B:109:0x022e, B:110:0x0231, B:42:0x0101, B:56:0x014d, B:58:0x0154, B:60:0x0158, B:62:0x015d, B:64:0x0163, B:108:0x0227, B:65:0x016d, B:67:0x0174, B:70:0x0183, B:71:0x0192, B:73:0x0198, B:75:0x01a2, B:76:0x01a6, B:77:0x01b7, B:79:0x01bd, B:81:0x01cf, B:82:0x01d3, B:83:0x01d7, B:84:0x01da, B:94:0x01fe, B:96:0x0207, B:100:0x0215, B:104:0x021c, B:95:0x0203, B:45:0x0118, B:47:0x012e, B:51:0x0141, B:97:0x020b, B:99:0x0211, B:102:0x021a), top: B:148:0x004d, inners: #0, #2, #7, #8, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0183 A[Catch: all -> 0x0232, TRY_ENTER, TryCatch #3 {all -> 0x0232, blocks: (B:9:0x004d, B:11:0x0059, B:12:0x005a, B:14:0x0063, B:16:0x0067, B:18:0x0080, B:20:0x0087, B:21:0x008a, B:22:0x008f, B:23:0x0097, B:25:0x009f, B:27:0x00a7, B:29:0x00b9, B:30:0x00c3, B:31:0x00d1, B:39:0x00f9, B:43:0x0105, B:44:0x0108, B:48:0x0138, B:49:0x013c, B:109:0x022e, B:110:0x0231, B:42:0x0101, B:56:0x014d, B:58:0x0154, B:60:0x0158, B:62:0x015d, B:64:0x0163, B:108:0x0227, B:65:0x016d, B:67:0x0174, B:70:0x0183, B:71:0x0192, B:73:0x0198, B:75:0x01a2, B:76:0x01a6, B:77:0x01b7, B:79:0x01bd, B:81:0x01cf, B:82:0x01d3, B:83:0x01d7, B:84:0x01da, B:94:0x01fe, B:96:0x0207, B:100:0x0215, B:104:0x021c, B:95:0x0203, B:45:0x0118, B:47:0x012e, B:51:0x0141, B:97:0x020b, B:99:0x0211, B:102:0x021a), top: B:148:0x004d, inners: #0, #2, #7, #8, #10 }] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.CXa] */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.CXa] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC3607CXa.run():void");
    }
}
