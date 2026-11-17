package com.facebook.aura.skills.repo;

import X.AbstractC0885AGm;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C0881AGi;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C7BY;
import X.C9oY;
import com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggerKt;
import com.facebook.aura.skills.connect.config.AccountIdentity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public abstract class SkillsFirstPartyAccountsRepositoryJsonKt {
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a0, code lost:
    
        if ((!r1.isEmpty()) == true) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b2  */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.skills.repo.OAuthLinkedAccountGroup toLinkedAccountGroup(kotlinx.serialization.json.JsonObject r8, java.util.Map<java.lang.String, com.facebook.aura.skills.repo.OAuthLinkedAccount> r9) {
        /*
            java.lang.String r0 = "key"
            java.lang.String r0 = stringField(r8, r0)
            r7 = 0
            if (r0 == 0) goto La2
            java.lang.String r4 = X.AnonymousClass002.A0l(r0)
            if (r4 == 0) goto La2
            int r0 = r4.length()
            if (r0 <= 0) goto La2
            java.lang.String r0 = "label"
            java.lang.String r0 = stringField(r8, r0)
            if (r0 == 0) goto La2
            java.lang.String r3 = X.AnonymousClass002.A0l(r0)
            if (r3 == 0) goto La2
            int r0 = r3.length()
            if (r0 <= 0) goto La2
            java.lang.String r5 = "account_ids"
            java.lang.Object r1 = r8.get(r5)
            boolean r0 = r1 instanceof kotlinx.serialization.json.JsonArray
            if (r0 == 0) goto L7d
            kotlinx.serialization.json.JsonArray r1 = (kotlinx.serialization.json.JsonArray) r1
            if (r1 == 0) goto L7d
            java.util.ArrayList r6 = X.C3cG.A0h()
            java.util.Iterator r2 = r1.iterator()
        L3f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5b
            kotlinx.serialization.json.JsonElement r1 = X.C60Q.A11(r2)
            boolean r0 = r1 instanceof kotlinx.serialization.json.JsonPrimitive
            if (r0 == 0) goto L3f
            kotlinx.serialization.json.JsonPrimitive r1 = (kotlinx.serialization.json.JsonPrimitive) r1
            if (r1 == 0) goto L3f
            java.lang.String r0 = X.C9oY.A04(r1)
            if (r0 == 0) goto L3f
            r6.add(r0)
            goto L3f
        L5b:
            java.util.List r0 = X.C3cG.A0m(r6)
            if (r0 == 0) goto L7d
            java.util.ArrayList r2 = X.C3cG.A0h()
            java.util.Iterator r1 = r0.iterator()
        L69:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r9.get(r0)
            if (r0 == 0) goto L69
            r2.add(r0)
            goto L69
        L7d:
            X.AGi r2 = X.C0881AGi.A00
        L7f:
            java.lang.String r0 = "kind"
            java.lang.String r1 = stringField(r8, r0)
            java.lang.String r0 = "disclosure"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto La3
            java.lang.Object r1 = r8.get(r5)
            boolean r0 = r1 instanceof kotlinx.serialization.json.JsonArray
            if (r0 == 0) goto Laa
            kotlinx.serialization.json.JsonArray r1 = (kotlinx.serialization.json.JsonArray) r1
            if (r1 == 0) goto Laa
            boolean r0 = r1.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != r1) goto Laa
        La2:
            return r7
        La3:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Laa
            return r7
        Laa:
            java.lang.String r0 = "icon"
            java.lang.String r0 = stringField(r8, r0)
            if (r0 != 0) goto Lb4
            java.lang.String r0 = ""
        Lb4:
            com.facebook.aura.skills.repo.OAuthLinkedAccountGroupIcon r1 = toLinkedAccountGroupIcon(r0)
            com.facebook.aura.skills.repo.OAuthLinkedAccountGroup r0 = new com.facebook.aura.skills.repo.OAuthLinkedAccountGroup
            r0.<init>(r4, r1, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.repo.SkillsFirstPartyAccountsRepositoryJsonKt.toLinkedAccountGroup(kotlinx.serialization.json.JsonObject, java.util.Map):com.facebook.aura.skills.repo.OAuthLinkedAccountGroup");
    }

    public static final String stringField(JsonObject jsonObject, String str) {
        JsonPrimitive jsonPrimitive;
        Object obj = jsonObject.get(str);
        if (!(obj instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) obj) == null) {
            return null;
        }
        return C9oY.A04(jsonPrimitive);
    }

    public static final OAuthLinkedAccount toLinkedAccount(JsonObject jsonObject, AccountIdentity accountIdentity) {
        JsonPrimitive jsonPrimitive;
        Boolean boolA01;
        String strStringField = stringField(jsonObject, accountIdentity.getIdFieldName());
        if (strStringField == null || C7BY.A0j(strStringField)) {
            return null;
        }
        String strStringField2 = stringField(jsonObject, accountIdentity.getUsernameFieldName());
        if (strStringField2 == null) {
            strStringField2 = "";
        }
        String strStringField3 = stringField(jsonObject, accountIdentity.getProfilePicFieldName());
        if (strStringField3 == null || C7BY.A0j(strStringField3)) {
            strStringField3 = null;
        }
        Object obj = jsonObject.get("connected");
        return new OAuthLinkedAccount(strStringField, strStringField2, strStringField3, (!(obj instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) obj) == null || (boolA01 = C9oY.A01(jsonPrimitive)) == null) ? false : boolA01.booleanValue());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final OAuthLinkedAccountGroupIcon toLinkedAccountGroupIcon(String str) {
        String strA0u = AnonymousClass001.A0u(str);
        switch (strA0u.hashCode()) {
            case -1146830912:
                if (strA0u.equals("business")) {
                    return OAuthLinkedAccountGroupIcon.BUSINESS;
                }
                break;
            case 3347973:
                if (strA0u.equals("meta")) {
                    return OAuthLinkedAccountGroupIcon.META;
                }
                break;
            case 28903346:
                if (strA0u.equals(MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_INSTAGRAM)) {
                    return OAuthLinkedAccountGroupIcon.INSTAGRAM;
                }
                break;
            case 497130182:
                if (strA0u.equals(MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_FACEBOOK)) {
                    return OAuthLinkedAccountGroupIcon.FACEBOOK;
                }
                break;
        }
        return OAuthLinkedAccountGroupIcon.UNSPECIFIED;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final OAuthLinkedAccountsResult toLinkedAccountsResult(JsonObject jsonObject, AccountIdentity accountIdentity) {
        ?? A0z;
        ?? A0h;
        JsonArray jsonArray;
        JsonObject jsonObject2;
        OAuthLinkedAccountGroup linkedAccountGroup;
        JsonArray jsonArray2;
        JsonObject jsonObject3;
        OAuthLinkedAccount linkedAccount;
        AnonymousClass003.A0u(jsonObject, accountIdentity);
        Object obj = jsonObject.get("accounts");
        if (!(obj instanceof JsonArray) || (jsonArray2 = (JsonArray) obj) == null) {
            A0z = AbstractC0885AGm.A0z(toLinkedAccount(jsonObject, accountIdentity));
        } else {
            A0z = C3cG.A0h();
            Iterator<JsonElement> it = jsonArray2.iterator();
            while (it.hasNext()) {
                JsonElement jsonElementA11 = C60Q.A11(it);
                if ((jsonElementA11 instanceof JsonObject) && (jsonObject3 = (JsonObject) jsonElementA11) != null && (linkedAccount = toLinkedAccount(jsonObject3, accountIdentity)) != null) {
                    A0z.add(linkedAccount);
                }
            }
        }
        Object obj2 = jsonObject.get("groups");
        if (!(obj2 instanceof JsonArray) || (jsonArray = (JsonArray) obj2) == null) {
            A0h = C0881AGi.A00;
        } else {
            LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(A0z));
            for (Object obj3 : A0z) {
                linkedHashMapA15.put(((OAuthLinkedAccount) obj3).accountId, obj3);
            }
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator<JsonElement> it2 = jsonArray.iterator();
            while (it2.hasNext()) {
                JsonElement jsonElementA112 = C60Q.A11(it2);
                if ((jsonElementA112 instanceof JsonObject) && (jsonObject2 = (JsonObject) jsonElementA112) != null && (linkedAccountGroup = toLinkedAccountGroup(jsonObject2, linkedHashMapA15)) != null) {
                    arrayListA0h.add(linkedAccountGroup);
                }
            }
            HashSet hashSetA13 = C60O.A13();
            A0h = C3cG.A0h();
            for (Object obj4 : arrayListA0h) {
                AnonymousClass006.A1P(((OAuthLinkedAccountGroup) obj4).key, obj4, hashSetA13, A0h);
            }
        }
        return new OAuthLinkedAccountsResult(A0z, A0h);
    }
}
