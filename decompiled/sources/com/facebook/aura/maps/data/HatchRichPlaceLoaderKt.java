package com.facebook.aura.maps.data;

import X.AbstractC3358CGz;
import X.C7384Etj;
import X.C9WR;
import X.C9WS;
import com.facebook.aura.graphql.AuraGraphQLService;
import com.facebook.maps.ui.places.MetaPlaceDetailsService;

/* loaded from: classes4.dex */
public abstract class HatchRichPlaceLoaderKt {

    /* renamed from: com.facebook.aura.maps.data.HatchRichPlaceLoaderKt$hatchRichPlaceLoader$1, reason: invalid class name */
    public final class AnonymousClass1 implements HatchPlaceDetailsLoader {
        public final /* synthetic */ MetaPlaceDetailsService $service;

        public AnonymousClass1(MetaPlaceDetailsService metaPlaceDetailsService) {
            this.$service = metaPlaceDetailsService;
        }

        public static final C9WR A00(C9WS c9ws) {
            switch (c9ws.ordinal()) {
                case 1:
                    return C9WR.A02;
                case 2:
                    return C9WR.A03;
                case 3:
                default:
                    return C9WR.A04;
                case 4:
                    return C9WR.A05;
                case 5:
                    return C9WR.A06;
                case 6:
                    return C9WR.A07;
                case 7:
                    return C9WR.A08;
                case 8:
                    return C9WR.A09;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:100:0x01c9  */
        /* JADX WARN: Removed duplicated region for block: B:104:0x020c A[LOOP:3: B:102:0x0206->B:104:0x020c, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:108:0x0228  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x0241  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0255 A[LOOP:21: B:115:0x024f->B:117:0x0255, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:121:0x0272  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x0280  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x029d A[LOOP:5: B:127:0x0297->B:129:0x029d, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:134:0x02bd  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x02cb  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x02e8 A[LOOP:7: B:140:0x02e2->B:142:0x02e8, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:147:0x0308  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x0316  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x0334 A[LOOP:9: B:153:0x032e->B:155:0x0334, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:160:0x0356  */
        /* JADX WARN: Removed duplicated region for block: B:178:0x03c9 A[PHI: r21 r22 r28 r29 r30 r43 r44
  0x03c9: PHI (r21v5 java.lang.Integer) = (r21v12 java.lang.Integer), (r21v13 java.lang.Integer) binds: [B:89:0x0198, B:87:0x018f] A[DONT_GENERATE, DONT_INLINE]
  0x03c9: PHI (r22v4 java.lang.Integer) = (r22v11 java.lang.Integer), (r22v12 java.lang.Integer) binds: [B:89:0x0198, B:87:0x018f] A[DONT_GENERATE, DONT_INLINE]
  0x03c9: PHI (r28v3 java.lang.String) = (r28v10 java.lang.String), (r28v11 java.lang.String) binds: [B:89:0x0198, B:87:0x018f] A[DONT_GENERATE, DONT_INLINE]
  0x03c9: PHI (r29v1 java.lang.String) = (r29v8 java.lang.String), (r29v9 java.lang.String) binds: [B:89:0x0198, B:87:0x018f] A[DONT_GENERATE, DONT_INLINE]
  0x03c9: PHI (r30v0 java.lang.String) = (r30v7 java.lang.String), (r30v8 java.lang.String) binds: [B:89:0x0198, B:87:0x018f] A[DONT_GENERATE, DONT_INLINE]
  0x03c9: PHI (r43v2 boolean) = (r43v9 boolean), (r43v10 boolean) binds: [B:89:0x0198, B:87:0x018f] A[DONT_GENERATE, DONT_INLINE]
  0x03c9: PHI (r44v1 boolean) = (r44v8 boolean), (r44v9 boolean) binds: [B:89:0x0198, B:87:0x018f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:181:0x03cf A[PHI: r21 r22 r28 r29 r30 r31 r43 r44
  0x03cf: PHI (r21v6 java.lang.Integer) = (r21v5 java.lang.Integer), (r21v11 java.lang.Integer), (r21v11 java.lang.Integer), (r21v11 java.lang.Integer) binds: [B:179:0x03cb, B:92:0x01a8, B:94:0x01b1, B:96:0x01b7] A[DONT_GENERATE, DONT_INLINE]
  0x03cf: PHI (r22v5 java.lang.Integer) = (r22v4 java.lang.Integer), (r22v10 java.lang.Integer), (r22v10 java.lang.Integer), (r22v10 java.lang.Integer) binds: [B:179:0x03cb, B:92:0x01a8, B:94:0x01b1, B:96:0x01b7] A[DONT_GENERATE, DONT_INLINE]
  0x03cf: PHI (r28v4 java.lang.String) = (r28v3 java.lang.String), (r28v9 java.lang.String), (r28v9 java.lang.String), (r28v9 java.lang.String) binds: [B:179:0x03cb, B:92:0x01a8, B:94:0x01b1, B:96:0x01b7] A[DONT_GENERATE, DONT_INLINE]
  0x03cf: PHI (r29v2 java.lang.String) = (r29v1 java.lang.String), (r29v7 java.lang.String), (r29v7 java.lang.String), (r29v7 java.lang.String) binds: [B:179:0x03cb, B:92:0x01a8, B:94:0x01b1, B:96:0x01b7] A[DONT_GENERATE, DONT_INLINE]
  0x03cf: PHI (r30v1 java.lang.String) = (r30v0 java.lang.String), (r30v6 java.lang.String), (r30v6 java.lang.String), (r30v6 java.lang.String) binds: [B:179:0x03cb, B:92:0x01a8, B:94:0x01b1, B:96:0x01b7] A[DONT_GENERATE, DONT_INLINE]
  0x03cf: PHI (r31v1 java.lang.String) = (r31v0 java.lang.String), (r31v6 java.lang.String), (r31v6 java.lang.String), (r31v6 java.lang.String) binds: [B:179:0x03cb, B:92:0x01a8, B:94:0x01b1, B:96:0x01b7] A[DONT_GENERATE, DONT_INLINE]
  0x03cf: PHI (r43v3 boolean) = (r43v2 boolean), (r43v8 boolean), (r43v8 boolean), (r43v8 boolean) binds: [B:179:0x03cb, B:92:0x01a8, B:94:0x01b1, B:96:0x01b7] A[DONT_GENERATE, DONT_INLINE]
  0x03cf: PHI (r44v2 boolean) = (r44v1 boolean), (r44v7 boolean), (r44v7 boolean), (r44v7 boolean) binds: [B:179:0x03cb, B:92:0x01a8, B:94:0x01b1, B:96:0x01b7] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:184:0x03d5 A[PHI: r21 r22 r28 r29 r30 r31 r32 r43 r44
  0x03d5: PHI (r21v7 java.lang.Integer) = (r21v6 java.lang.Integer), (r21v10 java.lang.Integer) binds: [B:182:0x03d1, B:99:0x01c7] A[DONT_GENERATE, DONT_INLINE]
  0x03d5: PHI (r22v6 java.lang.Integer) = (r22v5 java.lang.Integer), (r22v9 java.lang.Integer) binds: [B:182:0x03d1, B:99:0x01c7] A[DONT_GENERATE, DONT_INLINE]
  0x03d5: PHI (r28v5 java.lang.String) = (r28v4 java.lang.String), (r28v8 java.lang.String) binds: [B:182:0x03d1, B:99:0x01c7] A[DONT_GENERATE, DONT_INLINE]
  0x03d5: PHI (r29v3 java.lang.String) = (r29v2 java.lang.String), (r29v6 java.lang.String) binds: [B:182:0x03d1, B:99:0x01c7] A[DONT_GENERATE, DONT_INLINE]
  0x03d5: PHI (r30v2 java.lang.String) = (r30v1 java.lang.String), (r30v5 java.lang.String) binds: [B:182:0x03d1, B:99:0x01c7] A[DONT_GENERATE, DONT_INLINE]
  0x03d5: PHI (r31v2 java.lang.String) = (r31v1 java.lang.String), (r31v5 java.lang.String) binds: [B:182:0x03d1, B:99:0x01c7] A[DONT_GENERATE, DONT_INLINE]
  0x03d5: PHI (r32v1 java.lang.String) = (r32v0 java.lang.String), (r32v4 java.lang.String) binds: [B:182:0x03d1, B:99:0x01c7] A[DONT_GENERATE, DONT_INLINE]
  0x03d5: PHI (r43v4 boolean) = (r43v3 boolean), (r43v7 boolean) binds: [B:182:0x03d1, B:99:0x01c7] A[DONT_GENERATE, DONT_INLINE]
  0x03d5: PHI (r44v3 boolean) = (r44v2 boolean), (r44v6 boolean) binds: [B:182:0x03d1, B:99:0x01c7] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:190:0x03f5 A[LOOP:11: B:188:0x03ef->B:190:0x03f5, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:191:0x0402 A[PHI: r21 r22 r28 r43 r44
  0x0402: PHI (r21v14 java.lang.Integer) = (r21v4 java.lang.Integer), (r21v15 java.lang.Integer) binds: [B:84:0x0189, B:82:0x0185] A[DONT_GENERATE, DONT_INLINE]
  0x0402: PHI (r22v13 java.lang.Integer) = (r22v3 java.lang.Integer), (r22v14 java.lang.Integer) binds: [B:84:0x0189, B:82:0x0185] A[DONT_GENERATE, DONT_INLINE]
  0x0402: PHI (r28v12 java.lang.String) = (r28v2 java.lang.String), (r28v13 java.lang.String) binds: [B:84:0x0189, B:82:0x0185] A[DONT_GENERATE, DONT_INLINE]
  0x0402: PHI (r43v11 boolean) = (r43v1 boolean), (r43v12 boolean) binds: [B:84:0x0189, B:82:0x0185] A[DONT_GENERATE, DONT_INLINE]
  0x0402: PHI (r44v10 boolean) = (r44v0 boolean), (r44v11 boolean) binds: [B:84:0x0189, B:82:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:215:0x0482  */
        /* JADX WARN: Removed duplicated region for block: B:218:0x0488 A[PHI: r21
  0x0488: PHI (r21v1 java.lang.Integer) = (r21v0 java.lang.Integer), (r21v18 java.lang.Integer) binds: [B:216:0x0484, B:63:0x0141] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:221:0x048e A[PHI: r21 r22
  0x048e: PHI (r21v2 java.lang.Integer) = (r21v1 java.lang.Integer), (r21v17 java.lang.Integer) binds: [B:219:0x048a, B:71:0x0158] A[DONT_GENERATE, DONT_INLINE]
  0x048e: PHI (r22v1 java.lang.Integer) = (r22v0 java.lang.Integer), (r22v16 java.lang.Integer) binds: [B:219:0x048a, B:71:0x0158] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:224:0x0494  */
        /* JADX WARN: Removed duplicated region for block: B:227:0x049a A[PHI: r19
  0x049a: PHI (r19v1 java.lang.Double) = (r19v0 java.lang.Double), (r19v3 java.lang.Double) binds: [B:225:0x0496, B:46:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:233:0x04b9  */
        /* JADX WARN: Removed duplicated region for block: B:237:0x04d2  */
        /* JADX WARN: Removed duplicated region for block: B:261:0x0589 A[LOOP:13: B:259:0x0583->B:261:0x0589, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:265:0x05a8  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:296:0x0668  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009b A[PHI: r24 r25
  0x009b: PHI (r24v4 java.lang.String) = (r24v1 java.lang.String), (r24v5 java.lang.String) binds: [B:38:0x00e9, B:28:0x0094] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r25v3 java.lang.String) = (r25v0 java.lang.String), (r25v4 java.lang.String) binds: [B:38:0x00e9, B:28:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:309:0x06d3  */
        /* JADX WARN: Removed duplicated region for block: B:327:0x0761  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b7 A[LOOP:0: B:30:0x00b1->B:32:0x00b7, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:331:0x077b A[LOOP:19: B:329:0x0775->B:331:0x077b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:335:0x079a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:372:0x0232 A[EDGE_INSN: B:372:0x0232->B:110:0x0232 BREAK  A[LOOP:4: B:106:0x0221->B:374:?], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:376:0x02f5 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:380:0x0341 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:410:0x02aa A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x016a  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0172 A[PHI: r21 r22 r28
  0x0172: PHI (r21v3 java.lang.Integer) = (r21v2 java.lang.Integer), (r21v16 java.lang.Integer), (r21v16 java.lang.Integer) binds: [B:222:0x0490, B:74:0x0168, B:76:0x0170] A[DONT_GENERATE, DONT_INLINE]
  0x0172: PHI (r22v2 java.lang.Integer) = (r22v1 java.lang.Integer), (r22v15 java.lang.Integer), (r22v15 java.lang.Integer) binds: [B:222:0x0490, B:74:0x0168, B:76:0x0170] A[DONT_GENERATE, DONT_INLINE]
  0x0172: PHI (r28v1 java.lang.String) = (r28v0 java.lang.String), (r28v14 java.lang.String), (r28v14 java.lang.String) binds: [B:222:0x0490, B:74:0x0168, B:76:0x0170] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0176 A[PHI: r21 r22 r28 r43
  0x0176: PHI (r21v15 java.lang.Integer) = (r21v3 java.lang.Integer), (r21v16 java.lang.Integer) binds: [B:78:0x0174, B:76:0x0170] A[DONT_GENERATE, DONT_INLINE]
  0x0176: PHI (r22v14 java.lang.Integer) = (r22v2 java.lang.Integer), (r22v15 java.lang.Integer) binds: [B:78:0x0174, B:76:0x0170] A[DONT_GENERATE, DONT_INLINE]
  0x0176: PHI (r28v13 java.lang.String) = (r28v1 java.lang.String), (r28v14 java.lang.String) binds: [B:78:0x0174, B:76:0x0170] A[DONT_GENERATE, DONT_INLINE]
  0x0176: PHI (r43v12 boolean) = (r43v0 boolean), (r43v13 boolean) binds: [B:78:0x0174, B:76:0x0170] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0187 A[PHI: r21 r22 r28 r43
  0x0187: PHI (r21v4 java.lang.Integer) = (r21v3 java.lang.Integer), (r21v15 java.lang.Integer), (r21v15 java.lang.Integer) binds: [B:78:0x0174, B:80:0x017d, B:82:0x0185] A[DONT_GENERATE, DONT_INLINE]
  0x0187: PHI (r22v3 java.lang.Integer) = (r22v2 java.lang.Integer), (r22v14 java.lang.Integer), (r22v14 java.lang.Integer) binds: [B:78:0x0174, B:80:0x017d, B:82:0x0185] A[DONT_GENERATE, DONT_INLINE]
  0x0187: PHI (r28v2 java.lang.String) = (r28v1 java.lang.String), (r28v13 java.lang.String), (r28v13 java.lang.String) binds: [B:78:0x0174, B:80:0x017d, B:82:0x0185] A[DONT_GENERATE, DONT_INLINE]
  0x0187: PHI (r43v1 boolean) = (r43v0 boolean), (r43v12 boolean), (r43v12 boolean) binds: [B:78:0x0174, B:80:0x017d, B:82:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:90:0x019a  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01c0 A[PHI: r21 r22 r28 r29 r30 r31 r32 r43 r44
  0x01c0: PHI (r21v10 java.lang.Integer) = (r21v6 java.lang.Integer), (r21v11 java.lang.Integer) binds: [B:182:0x03d1, B:97:0x01b9] A[DONT_GENERATE, DONT_INLINE]
  0x01c0: PHI (r22v9 java.lang.Integer) = (r22v5 java.lang.Integer), (r22v10 java.lang.Integer) binds: [B:182:0x03d1, B:97:0x01b9] A[DONT_GENERATE, DONT_INLINE]
  0x01c0: PHI (r28v8 java.lang.String) = (r28v4 java.lang.String), (r28v9 java.lang.String) binds: [B:182:0x03d1, B:97:0x01b9] A[DONT_GENERATE, DONT_INLINE]
  0x01c0: PHI (r29v6 java.lang.String) = (r29v2 java.lang.String), (r29v7 java.lang.String) binds: [B:182:0x03d1, B:97:0x01b9] A[DONT_GENERATE, DONT_INLINE]
  0x01c0: PHI (r30v5 java.lang.String) = (r30v1 java.lang.String), (r30v6 java.lang.String) binds: [B:182:0x03d1, B:97:0x01b9] A[DONT_GENERATE, DONT_INLINE]
  0x01c0: PHI (r31v5 java.lang.String) = (r31v1 java.lang.String), (r31v6 java.lang.String) binds: [B:182:0x03d1, B:97:0x01b9] A[DONT_GENERATE, DONT_INLINE]
  0x01c0: PHI (r32v4 java.lang.String) = (r32v0 java.lang.String), (r32v5 java.lang.String) binds: [B:182:0x03d1, B:97:0x01b9] A[DONT_GENERATE, DONT_INLINE]
  0x01c0: PHI (r43v7 boolean) = (r43v3 boolean), (r43v8 boolean) binds: [B:182:0x03d1, B:97:0x01b9] A[DONT_GENERATE, DONT_INLINE]
  0x01c0: PHI (r44v6 boolean) = (r44v2 boolean), (r44v7 boolean) binds: [B:182:0x03d1, B:97:0x01b9] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r12v2, types: [X.AGi] */
        /* JADX WARN: Type inference failed for: r12v3 */
        /* JADX WARN: Type inference failed for: r12v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r5v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v4 */
        /* JADX WARN: Type inference failed for: r6v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
        @Override // com.facebook.aura.maps.data.HatchPlaceDetailsLoader
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object load(java.lang.String r52, java.lang.String r53, X.HtJ<? super com.facebook.aura.maps.data.HatchPlaceDetailsLoadResult> r54) {
            /*
                Method dump skipped, instructions count: 2133
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.maps.data.HatchRichPlaceLoaderKt.AnonymousClass1.load(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
        }
    }

    public static final HatchPlaceDetailsLoader hatchRichPlaceLoader(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return new AnonymousClass1(new MetaPlaceDetailsService(AuraGraphQLService.INSTANCE.abraInstance(abstractC3358CGz)));
    }
}
