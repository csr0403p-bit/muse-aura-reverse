package com.facebook.aura.localbrowser.connector;

import X.ADq;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFI;
import X.BNt;
import X.C3cG;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C7BY;
import X.DBJ;
import X.DCl;
import X.FGI;
import X.HxE;
import com.facebook.acra.util.HttpRequestMultipart;
import com.facebook.aura.maps.model.HatchMapSceneKt;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.tigon.iface.TigonRequest;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class DevToolsHandshake {
    public static final int $stable = 0;
    public static final int MAX_HEAD_BYTES = 8192;
    public static final DevToolsHandshake INSTANCE = new DevToolsHandshake();
    public static final byte[] HEAD_END = "\r\n\r\n".getBytes(DCl.A01);
    public static final Set<String> FORWARDED_HEADERS = BFI.A0H(new String[]{"sec-websocket-key", "sec-websocket-version", "sec-websocket-extensions", "sec-websocket-protocol"});

    public final Integer headLength(byte[] bArr, int i) {
        byte[] bArr2;
        C7384Etj.A0Y(bArr, 0);
        int i2 = 0;
        loop0: while (true) {
            bArr2 = HEAD_END;
            int length = bArr2.length;
            if (length + i2 > i) {
                return null;
            }
            ADq aDq = new ADq(0, length - 1);
            if (!(aDq instanceof Collection) || !C3cG.A1N(aDq)) {
                Iterator<Integer> it = aDq.iterator();
                while (it.hasNext()) {
                    int iA00 = ((BNt) it).A00();
                    if (bArr[i2 + iA00] != bArr2[iA00]) {
                        break;
                    }
                }
                break loop0;
            }
            break;
            i2++;
        }
        return Integer.valueOf(i2 + bArr2.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final byte[] rewrite(String str, String str2, String str3) {
        Object next;
        Object next2;
        int iA1a = AnonymousClass002.A1a(str, str2);
        C7384Etj.A0Y(str3, 2);
        List listA0i = C7BY.A0i(C7BY.A0L("\r\n\r\n", str), new String[]{HttpRequestMultipart.LINE_FEED}, 0);
        String str4 = (String) AbstractC0878AGe.A0G(listA0i);
        if (str4 != null) {
            char[] cArr = new char[iA1a];
            cArr[0] = ' ';
            List listA0g = C7BY.A0g(str4, cArr);
            if (listA0g != null && listA0g.size() == 3 && C7384Etj.areEqual(listA0g.get(0), TigonRequest.GET) && C7384Etj.areEqual(listA0g.get(2), "HTTP/1.1")) {
                String str5 = (String) listA0g.get(iA1a);
                String strA0d = FGI.A0d(CustomConnectorRegisterRepositoryKt.ROOT_PATH, str2, "/devtools/page/", str3);
                Charset charset = DCl.A05;
                if (!MessageDigest.isEqual(str5.getBytes(charset), strA0d.getBytes(charset))) {
                    return null;
                }
                List listA0Z = AbstractC0878AGe.A0Z(listA0i, iA1a);
                ArrayList arrayListA0h = C3cG.A0h();
                Iterator it = listA0Z.iterator();
                while (it.hasNext()) {
                    String strA0j = AnonymousClass005.A0j(it);
                    int iA08 = C7BY.A08(strA0j, HatchMapSceneKt.ARTIFACT_ID_SEPARATOR, 0);
                    if (iA08 > 0) {
                        AnonymousClass002.A1J(C3cJ.A0J(strA0j.substring(0, iA08)), AnonymousClass002.A0l(strA0j.substring(iA08 + 1)), arrayListA0h);
                    }
                }
                Iterator it2 = arrayListA0h.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (C3cG.A1O(DBJ.FIRST_RUN_UPGRADE, (HxE) next)) {
                        break;
                    }
                }
                HxE hxE = (HxE) next;
                String str6 = hxE != null ? (String) hxE.second : null;
                Iterator it3 = arrayListA0h.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    if (C7384Etj.areEqual(((HxE) next2).first, "connection")) {
                        break;
                    }
                }
                HxE hxE2 = (HxE) next2;
                String str7 = hxE2 != null ? (String) hxE2.second : null;
                if (str6 != null && str6.equalsIgnoreCase("websocket") && str7 != null) {
                    String strA0u = AnonymousClass001.A0u(str7);
                    char[] cArr2 = new char[iA1a];
                    cArr2[0] = ',';
                    List listA0g2 = C7BY.A0g(strA0u, cArr2);
                    if (listA0g2 == null || ((listA0g2 instanceof Collection) && listA0g2.isEmpty())) {
                        return null;
                    }
                    Iterator it4 = listA0g2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        if (DBJ.FIRST_RUN_UPGRADE.equals(AnonymousClass002.A0l(AnonymousClass005.A0j(it4)))) {
                            if ((arrayListA0h instanceof Collection) && arrayListA0h.isEmpty()) {
                                return null;
                            }
                            Iterator it5 = arrayListA0h.iterator();
                            while (it5.hasNext()) {
                                if (C7384Etj.areEqual(((HxE) it5.next()).first, "sec-websocket-key")) {
                                    StringBuilder sbA0x = C3cI.A0x("GET /devtools/page/", str3);
                                    sbA0x.append(" HTTP/1.1\r\nHost: localhost\r\nUpgrade: websocket\r\nConnection: Upgrade\r\n");
                                    ArrayList<HxE> arrayListA0h2 = C3cG.A0h();
                                    for (Object obj : arrayListA0h) {
                                        if (FORWARDED_HEADERS.contains(((HxE) obj).first)) {
                                            arrayListA0h2.add(obj);
                                        }
                                    }
                                    for (HxE hxE3 : arrayListA0h2) {
                                        String str8 = (String) hxE3.first;
                                        String str9 = (String) hxE3.second;
                                        sbA0x.append(str8);
                                        sbA0x.append(": ");
                                        sbA0x.append(str9);
                                        sbA0x.append(HttpRequestMultipart.LINE_FEED);
                                    }
                                    return AnonymousClass001.A0v(HttpRequestMultipart.LINE_FEED, sbA0x).getBytes(DCl.A01);
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
