package com.facebook.aura.email.repo;

import X.AbstractC0882AGj;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class EmailConnectorPermissionsJson extends C06G {
    public final List<EmailPermissionSectionJson> sections;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, EmailConnectorPermissionsJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<EmailConnectorPermissionsJson> serializer() {
            return EmailConnectorPermissionsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final EmailConnectorPermissionsJson copy(List<EmailPermissionSectionJson> list) {
        C7384Etj.A0Y(list, 0);
        return new EmailConnectorPermissionsJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof EmailConnectorPermissionsJson) && C7384Etj.areEqual(this.sections, ((EmailConnectorPermissionsJson) obj).sections));
    }

    public /* synthetic */ EmailConnectorPermissionsJson(List list, int i, C06H c06h) {
        this((i & 1) != 0 ? C0881AGi.A00 : list);
    }

    public static /* synthetic */ EmailConnectorPermissionsJson copy$default(EmailConnectorPermissionsJson emailConnectorPermissionsJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = emailConnectorPermissionsJson.sections;
        }
        C7384Etj.A0Y(list, 0);
        return new EmailConnectorPermissionsJson(list);
    }

    private final List<EmailPermissionMethodJson> getAllMethods() {
        List<EmailPermissionSectionJson> list = this.sections;
        ArrayList arrayList = new ArrayList();
        Iterator<EmailPermissionSectionJson> it = list.iterator();
        while (it.hasNext()) {
            AbstractC0882AGj.A0r(it.next().groups, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC0882AGj.A0r(((EmailPermissionGroupJson) it2.next()).methods, arrayList2);
        }
        return arrayList2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailConnectorPermissionsJson emailConnectorPermissionsJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || !C7384Etj.areEqual(emailConnectorPermissionsJson.sections, C0881AGi.A00)) {
            c9j5.AAQ(emailConnectorPermissionsJson.sections, C06G.A0e(f0cArr, 0), c9iZ, 0);
        }
    }

    public final List<EmailPermissionSectionJson> component1() {
        return this.sections;
    }

    public final List<EmailPermissionSectionJson> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return this.sections.hashCode();
    }

    public final boolean getShowsThreadReply() {
        List<EmailPermissionMethodJson> allMethods = getAllMethods();
        if (!(allMethods instanceof Collection) || !allMethods.isEmpty()) {
            Iterator<EmailPermissionMethodJson> it = allMethods.iterator();
            while (it.hasNext()) {
                if (EmailRepositoryJsonKt.THREAD_REPLY_METHOD.equals(it.next().key)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[LOOP:0: B:7:0x001e->B:9:0x0024, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> permissionActions(java.lang.String r5, com.facebook.aura.email.model.EmailSendPermission r6) {
        /*
            r4 = this;
            X.AnonymousClass003.A0u(r5, r6)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.List r1 = r4.getAllMethods()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L32
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L32
        L16:
            java.util.List r0 = r4.getAllMethods()
            java.util.Iterator r2 = r0.iterator()
        L1e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r0 = r2.next()
            com.facebook.aura.email.repo.EmailPermissionMethodJson r0 = (com.facebook.aura.email.repo.EmailPermissionMethodJson) r0
            java.lang.String r1 = r0.key
            java.lang.String r0 = r0.mode
            r3.put(r1, r0)
            goto L1e
        L32:
            java.util.Iterator r1 = r1.iterator()
        L36:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r1.next()
            com.facebook.aura.email.repo.EmailPermissionMethodJson r0 = (com.facebook.aura.email.repo.EmailPermissionMethodJson) r0
            kotlinx.serialization.json.JsonElement r0 = r0.mode_source
            if (r0 == 0) goto L36
        L46:
            java.lang.String r0 = r6.getWireValue()
            r3.put(r5, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailConnectorPermissionsJson.permissionActions(java.lang.String, com.facebook.aura.email.model.EmailSendPermission):java.util.Map");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.email.model.EmailPermissions toPermissions(boolean r14) {
        /*
            r13 = this;
            java.util.List r0 = r13.getAllMethods()
            java.util.ArrayList r2 = X.AnonymousClass003.A0i(r0)
            java.util.Iterator r6 = r0.iterator()
        Lc:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r5 = r6.next()
            com.facebook.aura.email.repo.EmailPermissionMethodJson r5 = (com.facebook.aura.email.repo.EmailPermissionMethodJson) r5
            java.lang.String r8 = r5.key
            java.lang.String r9 = r5.label
            int r0 = r9.length()
            if (r0 != 0) goto L23
            r9 = r8
        L23:
            java.lang.String r1 = r5.mode
            java.lang.String r0 = "deny_all"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            com.facebook.aura.email.model.EmailSendPermission r10 = com.facebook.aura.email.model.EmailSendPermission.DENY
        L2f:
            java.util.List<java.lang.String> r0 = r5.mode_options
            if (r0 != 0) goto L35
            java.util.List<java.lang.String> r0 = com.facebook.aura.email.repo.EmailRepositoryJsonKt.DEFAULT_MODE_OPTIONS
        L35:
            com.facebook.aura.email.model.EmailSendPermission$Companion r4 = com.facebook.aura.email.model.EmailSendPermission.Companion
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r0.iterator()
        L40:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L54
            java.lang.String r0 = X.AnonymousClass005.A0j(r1)
            com.facebook.aura.email.model.EmailSendPermission r0 = r4.fromWire(r0)
            if (r0 == 0) goto L40
            r3.add(r0)
            goto L40
        L54:
            X.AHD r11 = X.AGI.A07(r3)
            boolean r12 = r5.restricted
            java.lang.String r1 = r5.key
            java.lang.String r0 = "threads.reply"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L67
            r13 = 1
            if (r14 == 0) goto L68
        L67:
            r13 = 0
        L68:
            com.facebook.aura.email.model.EmailPermissionMethod r7 = new com.facebook.aura.email.model.EmailPermissionMethod
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r2.add(r7)
            goto Lc
        L71:
            com.facebook.aura.email.model.EmailSendPermission$Companion r0 = com.facebook.aura.email.model.EmailSendPermission.Companion
            com.facebook.aura.email.model.EmailSendPermission r10 = r0.fromWire(r1)
            if (r10 != 0) goto L2f
            com.facebook.aura.email.model.EmailSendPermission r10 = com.facebook.aura.email.model.EmailSendPermission.ASK
            goto L2f
        L7c:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L84
            r1 = 0
            return r1
        L84:
            X.AHD r0 = X.AGI.A07(r2)
            com.facebook.aura.email.model.EmailPermissions r1 = new com.facebook.aura.email.model.EmailPermissions
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailConnectorPermissionsJson.toPermissions(boolean):com.facebook.aura.email.model.EmailPermissions");
    }

    public String toString() {
        return super.toString();
    }

    public EmailConnectorPermissionsJson(List<EmailPermissionSectionJson> list) {
        C7384Etj.A0Y(list, 0);
        this.sections = list;
    }

    public /* synthetic */ EmailConnectorPermissionsJson(int i, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.sections = C0881AGi.A00;
        } else {
            this.sections = list;
        }
    }

    public EmailConnectorPermissionsJson() {
        this(C0881AGi.A00);
    }
}
