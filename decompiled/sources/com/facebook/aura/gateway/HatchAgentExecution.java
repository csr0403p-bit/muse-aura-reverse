package com.facebook.aura.gateway;

import X.A3q;
import X.AbstractC06907md;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BLG;
import X.C06H;
import X.C10533Hqc;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C60Q;
import X.C7384Etj;
import X.C78T;
import X.C9286GCn;
import X.G0U;
import X.HnJ;
import X.HoC;
import X.Hxb;
import X.InterfaceC7549F2g;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class HatchAgentExecution implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final long IDLE_EXPIRY_MS = 300000;
    public final C1BN<Set<String>> activeConversations;
    public final Map<String, Owner> agents;
    public boolean cleared;
    public HoC expiry;
    public final BLG<Set<String>> mutableConversations;
    public final BLG<Integer> mutableRequestCount;
    public final C1BN<Integer> requestCount;
    public final Map<String, Owner> requests;
    public final C3UX scope;
    public final Map<String, Owner> tasks;
    public final Map<String, Owner> turns;

    public final class Owner {
        public final String conversationId;
        public long expiresAt;
        public final String requestId;
        public String rootAgentId;
        public String userMessageId;

        public Owner(String str, String str2, long j) {
            C7384Etj.A0Y(str, 0);
            this.requestId = str;
            this.conversationId = str2;
            this.expiresAt = j;
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final long getExpiresAt() {
            return this.expiresAt;
        }

        public final String getRequestId() {
            return this.requestId;
        }

        public final String getRootAgentId() {
            return this.rootAgentId;
        }

        public final String getUserMessageId() {
            return this.userMessageId;
        }

        public final void setExpiresAt(long j) {
            this.expiresAt = j;
        }

        public final void setRootAgentId(String str) {
            this.rootAgentId = str;
        }

        public final void setUserMessageId(String str) {
            this.userMessageId = str;
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchAgentExecution$cancelRequests$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Map.Entry<String, Owner>, Boolean> {
        public final /* synthetic */ Set<String> $requestIds;

        @Override // X.G0U
        public final Boolean invoke(Map.Entry<String, Owner> entry) {
            C7384Etj.A0Y(entry, 0);
            return Boolean.valueOf(this.$requestIds.contains(entry.getKey()));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Set<String> set) {
            super(1);
            this.$requestIds = set;
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchAgentExecution$cancelRequests$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<Map.Entry<String, Owner>, Boolean> {
        public final /* synthetic */ Set<String> $requestIds;

        @Override // X.G0U
        public final Boolean invoke(Map.Entry<String, Owner> entry) {
            C7384Etj.A0Y(entry, 0);
            return Boolean.valueOf(this.$requestIds.contains(entry.getValue().requestId));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Set<String> set) {
            super(1);
            this.$requestIds = set;
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchAgentExecution$onChatEvent$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0U<Map.Entry<String, Owner>, Boolean> {
        public final /* synthetic */ Owner $owner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Owner owner) {
            super(1);
            this.$owner = owner;
        }

        @Override // X.G0U
        public final Boolean invoke(Map.Entry<String, Owner> entry) {
            return Boolean.valueOf(AnonymousClass002.A1Z(C60Q.A0Z(entry), this.$owner));
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchAgentExecution$onChatEvent$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0U<Map.Entry<String, Owner>, Boolean> {
        public final /* synthetic */ Owner $completed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(Owner owner) {
            super(1);
            this.$completed = owner;
        }

        @Override // X.G0U
        public final Boolean invoke(Map.Entry<String, Owner> entry) {
            return Boolean.valueOf(AnonymousClass002.A1Z(C60Q.A0Z(entry), this.$completed));
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchAgentExecution$publish$1, reason: invalid class name and case insensitive filesystem */
    public final class C120291 extends AbstractC7559F3s implements G0U<Map.Entry<String, Owner>, Boolean> {
        public final /* synthetic */ long $now;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120291(long j) {
            super(1);
            this.$now = j;
        }

        @Override // X.G0U
        public final Boolean invoke(Map.Entry<String, Owner> entry) {
            return Boolean.valueOf(((Owner) C60Q.A0Z(entry)).expiresAt <= this.$now);
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchAgentExecution$publish$2, reason: invalid class name and case insensitive filesystem */
    public final class C120302 extends AbstractC7559F3s implements G0U<Map.Entry<String, Owner>, Boolean> {
        public final /* synthetic */ long $now;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120302(long j) {
            super(1);
            this.$now = j;
        }

        @Override // X.G0U
        public final Boolean invoke(Map.Entry<String, Owner> entry) {
            return Boolean.valueOf(((Owner) C60Q.A0Z(entry)).expiresAt <= this.$now);
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchAgentExecution$publish$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<Map.Entry<String, Owner>, Boolean> {
        public final /* synthetic */ long $now;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(long j) {
            super(1);
            this.$now = j;
        }

        @Override // X.G0U
        public final Boolean invoke(Map.Entry<String, Owner> entry) {
            return Boolean.valueOf(((Owner) C60Q.A0Z(entry)).expiresAt <= this.$now);
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchAgentExecution$publish$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0U<Map.Entry<String, Owner>, Boolean> {
        public final /* synthetic */ long $now;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(long j) {
            super(1);
            this.$now = j;
        }

        @Override // X.G0U
        public final Boolean invoke(Map.Entry<String, Owner> entry) {
            return Boolean.valueOf(((Owner) C60Q.A0Z(entry)).expiresAt <= this.$now);
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchAgentExecution$publish$6, reason: invalid class name and case insensitive filesystem */
    public final class C120316 extends AbstractC7559F3s implements G0U<Map.Entry<String, Owner>, Boolean> {
        public final /* synthetic */ List<Owner> $owners;

        @Override // X.G0U
        public final Boolean invoke(Map.Entry<String, Owner> entry) {
            C7384Etj.A0Y(entry, 0);
            return C3cG.A0P(this.$owners.contains(entry.getValue()));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120316(List<Owner> list) {
            super(1);
            this.$owners = list;
        }
    }

    public final synchronized void acknowledge(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        Owner owner = this.requests.get(str);
        if (owner != null) {
            owner.userMessageId = str2;
        }
    }

    public final synchronized Set<String> activeRequestIds(String str) {
        LinkedHashSet linkedHashSetA0k;
        ArrayList arrayListA03 = AbstractC06907md.A03(this);
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = arrayListA03.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (C7384Etj.areEqual(((Owner) next).conversationId, str)) {
                arrayListA0h.add(next);
            }
        }
        linkedHashSetA0k = C3cG.A0k();
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            linkedHashSetA0k.add(((Owner) it2.next()).requestId);
        }
        return linkedHashSetA0k;
    }

    public final synchronized void beginRequest(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        if (!this.cleared && !this.requests.containsKey(str)) {
            this.requests.put(str, new Owner(str, str2, SystemClock.elapsedRealtime() + 300000));
            BLG<Integer> blg = this.mutableRequestCount;
            AnonymousClass002.A1I(blg, Integer.valueOf(AnonymousClass001.A0F(blg.getValue()) + 1));
            publish();
        }
    }

    public final synchronized void cancelRequests(Set<String> set) {
        C7384Etj.A0Y(set, 0);
        AbstractC0882AGj.A0t(this.requests.entrySet(), new AnonymousClass1(set));
        AbstractC0882AGj.A0t(this.turns.entrySet(), new AnonymousClass2(set));
        publish();
    }

    @Override // X.InterfaceC7549F2g
    public synchronized void clearUserData() {
        this.cleared = true;
        stopAll();
        Hxb.A03(null, this.scope);
    }

    public final synchronized void failRequest(String str) {
        C7384Etj.A0Y(str, 0);
        if (this.requests.remove(str) != null) {
            publish();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x01ce, code lost:
    
        if (r1 != null) goto L135;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0184 A[Catch: all -> 0x0342, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:7:0x000f, B:9:0x0016, B:14:0x0021, B:16:0x002f, B:18:0x003e, B:19:0x0050, B:21:0x0056, B:23:0x0065, B:25:0x0069, B:26:0x006c, B:28:0x0070, B:30:0x0078, B:31:0x007d, B:32:0x0087, B:34:0x008d, B:36:0x00a0, B:38:0x00a4, B:223:0x033a, B:224:0x033d, B:44:0x00b1, B:46:0x00b5, B:51:0x00c0, B:52:0x00c2, B:54:0x00ce, B:55:0x00d8, B:57:0x00de, B:59:0x00e7, B:61:0x00ef, B:66:0x00f8, B:68:0x00fc, B:70:0x0106, B:72:0x010a, B:74:0x0114, B:75:0x011e, B:77:0x0124, B:79:0x0133, B:82:0x013a, B:85:0x0144, B:87:0x0148, B:89:0x014e, B:136:0x01dc, B:139:0x01e3, B:140:0x01f5, B:138:0x01e0, B:93:0x0156, B:95:0x015a, B:98:0x0162, B:101:0x016e, B:111:0x017e, B:112:0x0180, B:114:0x0184, B:115:0x0186, B:119:0x0190, B:120:0x019c, B:122:0x01a2, B:124:0x01b1, B:127:0x01bb, B:133:0x01cb, B:135:0x01d0, B:100:0x0166, B:141:0x01fa, B:143:0x01fe, B:145:0x0204, B:177:0x027b, B:178:0x0281, B:180:0x0286, B:198:0x02c1, B:183:0x0290, B:186:0x029a, B:189:0x02a4, B:192:0x02ae, B:203:0x02d2, B:205:0x02d6, B:219:0x0327, B:221:0x032f, B:222:0x0334, B:207:0x02e0, B:209:0x02e4, B:211:0x02ee, B:212:0x030c, B:214:0x0312, B:217:0x0322, B:195:0x02b8, B:199:0x02c7, B:146:0x0207, B:148:0x020b, B:155:0x0219, B:156:0x021b, B:158:0x021f, B:159:0x0227, B:160:0x0233, B:162:0x0239, B:166:0x024c, B:168:0x0254, B:169:0x0258, B:170:0x0260, B:172:0x0266, B:173:0x0272), top: B:228:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x018c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0190 A[Catch: all -> 0x0342, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:7:0x000f, B:9:0x0016, B:14:0x0021, B:16:0x002f, B:18:0x003e, B:19:0x0050, B:21:0x0056, B:23:0x0065, B:25:0x0069, B:26:0x006c, B:28:0x0070, B:30:0x0078, B:31:0x007d, B:32:0x0087, B:34:0x008d, B:36:0x00a0, B:38:0x00a4, B:223:0x033a, B:224:0x033d, B:44:0x00b1, B:46:0x00b5, B:51:0x00c0, B:52:0x00c2, B:54:0x00ce, B:55:0x00d8, B:57:0x00de, B:59:0x00e7, B:61:0x00ef, B:66:0x00f8, B:68:0x00fc, B:70:0x0106, B:72:0x010a, B:74:0x0114, B:75:0x011e, B:77:0x0124, B:79:0x0133, B:82:0x013a, B:85:0x0144, B:87:0x0148, B:89:0x014e, B:136:0x01dc, B:139:0x01e3, B:140:0x01f5, B:138:0x01e0, B:93:0x0156, B:95:0x015a, B:98:0x0162, B:101:0x016e, B:111:0x017e, B:112:0x0180, B:114:0x0184, B:115:0x0186, B:119:0x0190, B:120:0x019c, B:122:0x01a2, B:124:0x01b1, B:127:0x01bb, B:133:0x01cb, B:135:0x01d0, B:100:0x0166, B:141:0x01fa, B:143:0x01fe, B:145:0x0204, B:177:0x027b, B:178:0x0281, B:180:0x0286, B:198:0x02c1, B:183:0x0290, B:186:0x029a, B:189:0x02a4, B:192:0x02ae, B:203:0x02d2, B:205:0x02d6, B:219:0x0327, B:221:0x032f, B:222:0x0334, B:207:0x02e0, B:209:0x02e4, B:211:0x02ee, B:212:0x030c, B:214:0x0312, B:217:0x0322, B:195:0x02b8, B:199:0x02c7, B:146:0x0207, B:148:0x020b, B:155:0x0219, B:156:0x021b, B:158:0x021f, B:159:0x0227, B:160:0x0233, B:162:0x0239, B:166:0x024c, B:168:0x0254, B:169:0x0258, B:170:0x0260, B:172:0x0266, B:173:0x0272), top: B:228:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x021f A[Catch: all -> 0x0342, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:7:0x000f, B:9:0x0016, B:14:0x0021, B:16:0x002f, B:18:0x003e, B:19:0x0050, B:21:0x0056, B:23:0x0065, B:25:0x0069, B:26:0x006c, B:28:0x0070, B:30:0x0078, B:31:0x007d, B:32:0x0087, B:34:0x008d, B:36:0x00a0, B:38:0x00a4, B:223:0x033a, B:224:0x033d, B:44:0x00b1, B:46:0x00b5, B:51:0x00c0, B:52:0x00c2, B:54:0x00ce, B:55:0x00d8, B:57:0x00de, B:59:0x00e7, B:61:0x00ef, B:66:0x00f8, B:68:0x00fc, B:70:0x0106, B:72:0x010a, B:74:0x0114, B:75:0x011e, B:77:0x0124, B:79:0x0133, B:82:0x013a, B:85:0x0144, B:87:0x0148, B:89:0x014e, B:136:0x01dc, B:139:0x01e3, B:140:0x01f5, B:138:0x01e0, B:93:0x0156, B:95:0x015a, B:98:0x0162, B:101:0x016e, B:111:0x017e, B:112:0x0180, B:114:0x0184, B:115:0x0186, B:119:0x0190, B:120:0x019c, B:122:0x01a2, B:124:0x01b1, B:127:0x01bb, B:133:0x01cb, B:135:0x01d0, B:100:0x0166, B:141:0x01fa, B:143:0x01fe, B:145:0x0204, B:177:0x027b, B:178:0x0281, B:180:0x0286, B:198:0x02c1, B:183:0x0290, B:186:0x029a, B:189:0x02a4, B:192:0x02ae, B:203:0x02d2, B:205:0x02d6, B:219:0x0327, B:221:0x032f, B:222:0x0334, B:207:0x02e0, B:209:0x02e4, B:211:0x02ee, B:212:0x030c, B:214:0x0312, B:217:0x0322, B:195:0x02b8, B:199:0x02c7, B:146:0x0207, B:148:0x020b, B:155:0x0219, B:156:0x021b, B:158:0x021f, B:159:0x0227, B:160:0x0233, B:162:0x0239, B:166:0x024c, B:168:0x0254, B:169:0x0258, B:170:0x0260, B:172:0x0266, B:173:0x0272), top: B:228:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0239 A[Catch: all -> 0x0342, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:7:0x000f, B:9:0x0016, B:14:0x0021, B:16:0x002f, B:18:0x003e, B:19:0x0050, B:21:0x0056, B:23:0x0065, B:25:0x0069, B:26:0x006c, B:28:0x0070, B:30:0x0078, B:31:0x007d, B:32:0x0087, B:34:0x008d, B:36:0x00a0, B:38:0x00a4, B:223:0x033a, B:224:0x033d, B:44:0x00b1, B:46:0x00b5, B:51:0x00c0, B:52:0x00c2, B:54:0x00ce, B:55:0x00d8, B:57:0x00de, B:59:0x00e7, B:61:0x00ef, B:66:0x00f8, B:68:0x00fc, B:70:0x0106, B:72:0x010a, B:74:0x0114, B:75:0x011e, B:77:0x0124, B:79:0x0133, B:82:0x013a, B:85:0x0144, B:87:0x0148, B:89:0x014e, B:136:0x01dc, B:139:0x01e3, B:140:0x01f5, B:138:0x01e0, B:93:0x0156, B:95:0x015a, B:98:0x0162, B:101:0x016e, B:111:0x017e, B:112:0x0180, B:114:0x0184, B:115:0x0186, B:119:0x0190, B:120:0x019c, B:122:0x01a2, B:124:0x01b1, B:127:0x01bb, B:133:0x01cb, B:135:0x01d0, B:100:0x0166, B:141:0x01fa, B:143:0x01fe, B:145:0x0204, B:177:0x027b, B:178:0x0281, B:180:0x0286, B:198:0x02c1, B:183:0x0290, B:186:0x029a, B:189:0x02a4, B:192:0x02ae, B:203:0x02d2, B:205:0x02d6, B:219:0x0327, B:221:0x032f, B:222:0x0334, B:207:0x02e0, B:209:0x02e4, B:211:0x02ee, B:212:0x030c, B:214:0x0312, B:217:0x0322, B:195:0x02b8, B:199:0x02c7, B:146:0x0207, B:148:0x020b, B:155:0x0219, B:156:0x021b, B:158:0x021f, B:159:0x0227, B:160:0x0233, B:162:0x0239, B:166:0x024c, B:168:0x0254, B:169:0x0258, B:170:0x0260, B:172:0x0266, B:173:0x0272), top: B:228:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0266 A[Catch: all -> 0x0342, LOOP:7: B:170:0x0260->B:172:0x0266, LOOP_END, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:7:0x000f, B:9:0x0016, B:14:0x0021, B:16:0x002f, B:18:0x003e, B:19:0x0050, B:21:0x0056, B:23:0x0065, B:25:0x0069, B:26:0x006c, B:28:0x0070, B:30:0x0078, B:31:0x007d, B:32:0x0087, B:34:0x008d, B:36:0x00a0, B:38:0x00a4, B:223:0x033a, B:224:0x033d, B:44:0x00b1, B:46:0x00b5, B:51:0x00c0, B:52:0x00c2, B:54:0x00ce, B:55:0x00d8, B:57:0x00de, B:59:0x00e7, B:61:0x00ef, B:66:0x00f8, B:68:0x00fc, B:70:0x0106, B:72:0x010a, B:74:0x0114, B:75:0x011e, B:77:0x0124, B:79:0x0133, B:82:0x013a, B:85:0x0144, B:87:0x0148, B:89:0x014e, B:136:0x01dc, B:139:0x01e3, B:140:0x01f5, B:138:0x01e0, B:93:0x0156, B:95:0x015a, B:98:0x0162, B:101:0x016e, B:111:0x017e, B:112:0x0180, B:114:0x0184, B:115:0x0186, B:119:0x0190, B:120:0x019c, B:122:0x01a2, B:124:0x01b1, B:127:0x01bb, B:133:0x01cb, B:135:0x01d0, B:100:0x0166, B:141:0x01fa, B:143:0x01fe, B:145:0x0204, B:177:0x027b, B:178:0x0281, B:180:0x0286, B:198:0x02c1, B:183:0x0290, B:186:0x029a, B:189:0x02a4, B:192:0x02ae, B:203:0x02d2, B:205:0x02d6, B:219:0x0327, B:221:0x032f, B:222:0x0334, B:207:0x02e0, B:209:0x02e4, B:211:0x02ee, B:212:0x030c, B:214:0x0312, B:217:0x0322, B:195:0x02b8, B:199:0x02c7, B:146:0x0207, B:148:0x020b, B:155:0x0219, B:156:0x021b, B:158:0x021f, B:159:0x0227, B:160:0x0233, B:162:0x0239, B:166:0x024c, B:168:0x0254, B:169:0x0258, B:170:0x0260, B:172:0x0266, B:173:0x0272), top: B:228:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[Catch: all -> 0x0342, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:7:0x000f, B:9:0x0016, B:14:0x0021, B:16:0x002f, B:18:0x003e, B:19:0x0050, B:21:0x0056, B:23:0x0065, B:25:0x0069, B:26:0x006c, B:28:0x0070, B:30:0x0078, B:31:0x007d, B:32:0x0087, B:34:0x008d, B:36:0x00a0, B:38:0x00a4, B:223:0x033a, B:224:0x033d, B:44:0x00b1, B:46:0x00b5, B:51:0x00c0, B:52:0x00c2, B:54:0x00ce, B:55:0x00d8, B:57:0x00de, B:59:0x00e7, B:61:0x00ef, B:66:0x00f8, B:68:0x00fc, B:70:0x0106, B:72:0x010a, B:74:0x0114, B:75:0x011e, B:77:0x0124, B:79:0x0133, B:82:0x013a, B:85:0x0144, B:87:0x0148, B:89:0x014e, B:136:0x01dc, B:139:0x01e3, B:140:0x01f5, B:138:0x01e0, B:93:0x0156, B:95:0x015a, B:98:0x0162, B:101:0x016e, B:111:0x017e, B:112:0x0180, B:114:0x0184, B:115:0x0186, B:119:0x0190, B:120:0x019c, B:122:0x01a2, B:124:0x01b1, B:127:0x01bb, B:133:0x01cb, B:135:0x01d0, B:100:0x0166, B:141:0x01fa, B:143:0x01fe, B:145:0x0204, B:177:0x027b, B:178:0x0281, B:180:0x0286, B:198:0x02c1, B:183:0x0290, B:186:0x029a, B:189:0x02a4, B:192:0x02ae, B:203:0x02d2, B:205:0x02d6, B:219:0x0327, B:221:0x032f, B:222:0x0334, B:207:0x02e0, B:209:0x02e4, B:211:0x02ee, B:212:0x030c, B:214:0x0312, B:217:0x0322, B:195:0x02b8, B:199:0x02c7, B:146:0x0207, B:148:0x020b, B:155:0x0219, B:156:0x021b, B:158:0x021f, B:159:0x0227, B:160:0x0233, B:162:0x0239, B:166:0x024c, B:168:0x0254, B:169:0x0258, B:170:0x0260, B:172:0x0266, B:173:0x0272), top: B:228:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02c1 A[Catch: all -> 0x0342, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:7:0x000f, B:9:0x0016, B:14:0x0021, B:16:0x002f, B:18:0x003e, B:19:0x0050, B:21:0x0056, B:23:0x0065, B:25:0x0069, B:26:0x006c, B:28:0x0070, B:30:0x0078, B:31:0x007d, B:32:0x0087, B:34:0x008d, B:36:0x00a0, B:38:0x00a4, B:223:0x033a, B:224:0x033d, B:44:0x00b1, B:46:0x00b5, B:51:0x00c0, B:52:0x00c2, B:54:0x00ce, B:55:0x00d8, B:57:0x00de, B:59:0x00e7, B:61:0x00ef, B:66:0x00f8, B:68:0x00fc, B:70:0x0106, B:72:0x010a, B:74:0x0114, B:75:0x011e, B:77:0x0124, B:79:0x0133, B:82:0x013a, B:85:0x0144, B:87:0x0148, B:89:0x014e, B:136:0x01dc, B:139:0x01e3, B:140:0x01f5, B:138:0x01e0, B:93:0x0156, B:95:0x015a, B:98:0x0162, B:101:0x016e, B:111:0x017e, B:112:0x0180, B:114:0x0184, B:115:0x0186, B:119:0x0190, B:120:0x019c, B:122:0x01a2, B:124:0x01b1, B:127:0x01bb, B:133:0x01cb, B:135:0x01d0, B:100:0x0166, B:141:0x01fa, B:143:0x01fe, B:145:0x0204, B:177:0x027b, B:178:0x0281, B:180:0x0286, B:198:0x02c1, B:183:0x0290, B:186:0x029a, B:189:0x02a4, B:192:0x02ae, B:203:0x02d2, B:205:0x02d6, B:219:0x0327, B:221:0x032f, B:222:0x0334, B:207:0x02e0, B:209:0x02e4, B:211:0x02ee, B:212:0x030c, B:214:0x0312, B:217:0x0322, B:195:0x02b8, B:199:0x02c7, B:146:0x0207, B:148:0x020b, B:155:0x0219, B:156:0x021b, B:158:0x021f, B:159:0x0227, B:160:0x0233, B:162:0x0239, B:166:0x024c, B:168:0x0254, B:169:0x0258, B:170:0x0260, B:172:0x0266, B:173:0x0272), top: B:228:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[Catch: all -> 0x0342, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:7:0x000f, B:9:0x0016, B:14:0x0021, B:16:0x002f, B:18:0x003e, B:19:0x0050, B:21:0x0056, B:23:0x0065, B:25:0x0069, B:26:0x006c, B:28:0x0070, B:30:0x0078, B:31:0x007d, B:32:0x0087, B:34:0x008d, B:36:0x00a0, B:38:0x00a4, B:223:0x033a, B:224:0x033d, B:44:0x00b1, B:46:0x00b5, B:51:0x00c0, B:52:0x00c2, B:54:0x00ce, B:55:0x00d8, B:57:0x00de, B:59:0x00e7, B:61:0x00ef, B:66:0x00f8, B:68:0x00fc, B:70:0x0106, B:72:0x010a, B:74:0x0114, B:75:0x011e, B:77:0x0124, B:79:0x0133, B:82:0x013a, B:85:0x0144, B:87:0x0148, B:89:0x014e, B:136:0x01dc, B:139:0x01e3, B:140:0x01f5, B:138:0x01e0, B:93:0x0156, B:95:0x015a, B:98:0x0162, B:101:0x016e, B:111:0x017e, B:112:0x0180, B:114:0x0184, B:115:0x0186, B:119:0x0190, B:120:0x019c, B:122:0x01a2, B:124:0x01b1, B:127:0x01bb, B:133:0x01cb, B:135:0x01d0, B:100:0x0166, B:141:0x01fa, B:143:0x01fe, B:145:0x0204, B:177:0x027b, B:178:0x0281, B:180:0x0286, B:198:0x02c1, B:183:0x0290, B:186:0x029a, B:189:0x02a4, B:192:0x02ae, B:203:0x02d2, B:205:0x02d6, B:219:0x0327, B:221:0x032f, B:222:0x0334, B:207:0x02e0, B:209:0x02e4, B:211:0x02ee, B:212:0x030c, B:214:0x0312, B:217:0x0322, B:195:0x02b8, B:199:0x02c7, B:146:0x0207, B:148:0x020b, B:155:0x0219, B:156:0x021b, B:158:0x021f, B:159:0x0227, B:160:0x0233, B:162:0x0239, B:166:0x024c, B:168:0x0254, B:169:0x0258, B:170:0x0260, B:172:0x0266, B:173:0x0272), top: B:228:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: all -> 0x0342, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:7:0x000f, B:9:0x0016, B:14:0x0021, B:16:0x002f, B:18:0x003e, B:19:0x0050, B:21:0x0056, B:23:0x0065, B:25:0x0069, B:26:0x006c, B:28:0x0070, B:30:0x0078, B:31:0x007d, B:32:0x0087, B:34:0x008d, B:36:0x00a0, B:38:0x00a4, B:223:0x033a, B:224:0x033d, B:44:0x00b1, B:46:0x00b5, B:51:0x00c0, B:52:0x00c2, B:54:0x00ce, B:55:0x00d8, B:57:0x00de, B:59:0x00e7, B:61:0x00ef, B:66:0x00f8, B:68:0x00fc, B:70:0x0106, B:72:0x010a, B:74:0x0114, B:75:0x011e, B:77:0x0124, B:79:0x0133, B:82:0x013a, B:85:0x0144, B:87:0x0148, B:89:0x014e, B:136:0x01dc, B:139:0x01e3, B:140:0x01f5, B:138:0x01e0, B:93:0x0156, B:95:0x015a, B:98:0x0162, B:101:0x016e, B:111:0x017e, B:112:0x0180, B:114:0x0184, B:115:0x0186, B:119:0x0190, B:120:0x019c, B:122:0x01a2, B:124:0x01b1, B:127:0x01bb, B:133:0x01cb, B:135:0x01d0, B:100:0x0166, B:141:0x01fa, B:143:0x01fe, B:145:0x0204, B:177:0x027b, B:178:0x0281, B:180:0x0286, B:198:0x02c1, B:183:0x0290, B:186:0x029a, B:189:0x02a4, B:192:0x02ae, B:203:0x02d2, B:205:0x02d6, B:219:0x0327, B:221:0x032f, B:222:0x0334, B:207:0x02e0, B:209:0x02e4, B:211:0x02ee, B:212:0x030c, B:214:0x0312, B:217:0x0322, B:195:0x02b8, B:199:0x02c7, B:146:0x0207, B:148:0x020b, B:155:0x0219, B:156:0x021b, B:158:0x021f, B:159:0x0227, B:160:0x0233, B:162:0x0239, B:166:0x024c, B:168:0x0254, B:169:0x0258, B:170:0x0260, B:172:0x0266, B:173:0x0272), top: B:228:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void onChatEvent(com.facebook.aura.model.HatchChatEvent r11, java.util.Map<java.lang.String, java.lang.String> r12) {
        /*
            Method dump skipped, instructions count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchAgentExecution.onChatEvent(com.facebook.aura.model.HatchChatEvent, java.util.Map):void");
    }

    public final synchronized void stopAll() {
        this.requests.clear();
        this.turns.clear();
        this.tasks.clear();
        this.agents.clear();
        publish();
    }

    private final void bindRootAgent(Owner owner, String str) {
        owner.rootAgentId = str;
        this.agents.put(str, owner);
        this.tasks.remove(str);
    }

    public final C1BN<Set<String>> getActiveConversations() {
        return this.activeConversations;
    }

    public final C1BN<Integer> getRequestCount() {
        return this.requestCount;
    }

    public final boolean isActive() {
        return !C3cG.A1N(this.mutableConversations.getValue());
    }

    /* loaded from: classes2.dex */
    public final class Companion {
        public final HatchAgentExecution getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchAgentExecution) abstractC3358CGz.A03(HatchAgentExecution.class, HatchAgentExecution$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final void extendOwners(String str) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + 300000;
        ArrayList arrayListA0P = AbstractC0878AGe.A0P(this.tasks.values(), AbstractC06907md.A03(this));
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = arrayListA0P.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (C7384Etj.areEqual(((Owner) next).conversationId, str)) {
                arrayListA0h.add(next);
            }
        }
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            ((Owner) it2.next()).expiresAt = jElapsedRealtime;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publish() {
        Long lValueOf;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AbstractC0882AGj.A0t(this.requests.entrySet(), new C120291(jElapsedRealtime));
        AbstractC0882AGj.A0t(this.turns.entrySet(), new C120302(jElapsedRealtime));
        AbstractC0882AGj.A0t(this.tasks.entrySet(), new AnonymousClass3(jElapsedRealtime));
        AbstractC0882AGj.A0t(this.agents.entrySet(), new AnonymousClass4(jElapsedRealtime));
        ArrayList arrayListA0P = AbstractC0878AGe.A0P(this.tasks.values(), AbstractC06907md.A03(this));
        Iterator it = arrayListA0P.iterator();
        C10533Hqc c10533HqcA11 = null;
        if (it.hasNext()) {
            lValueOf = Long.valueOf(((Owner) it.next()).expiresAt);
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((Owner) it.next()).expiresAt);
                if (lValueOf.compareTo(lValueOf2) > 0) {
                    lValueOf = lValueOf2;
                }
            }
        } else {
            lValueOf = null;
        }
        BLG<Set<String>> blg = this.mutableConversations;
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        Iterator it2 = arrayListA0P.iterator();
        while (it2.hasNext()) {
            linkedHashSetA0k.add(((Owner) it2.next()).conversationId);
        }
        AnonymousClass001.A1E(blg, null, linkedHashSetA0k);
        AbstractC0882AGj.A0t(this.agents.entrySet(), new C120316(arrayListA0P));
        HoC hoC = this.expiry;
        if (hoC != null) {
            hoC.A5w(null);
        }
        if (lValueOf != null) {
            c10533HqcA11 = AnonymousClass001.A11(new HatchAgentExecution$publish$7$1(lValueOf.longValue(), this, null), this.scope);
        }
        this.expiry = c10533HqcA11;
    }

    public /* synthetic */ HatchAgentExecution(C06H c06h) {
        this();
    }

    public HatchAgentExecution() {
        this.scope = C78T.A01(C3cG.A0v(), null);
        this.requests = C3cG.A0j();
        this.turns = C3cG.A0j();
        this.tasks = C3cG.A0j();
        this.agents = C3cG.A0j();
        C9286GCn c9286GCnA01 = HnJ.A01(A3q.A00);
        this.mutableConversations = c9286GCnA01;
        this.activeConversations = C3cG.A11(c9286GCnA01);
        C9286GCn c9286GCnA14 = C3cG.A14(0);
        this.mutableRequestCount = c9286GCnA14;
        this.requestCount = C3cG.A11(c9286GCnA14);
    }
}
