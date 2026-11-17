package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFI;
import X.BQG;
import X.C06827l3;
import X.C0881AGi;
import X.C3cI;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import com.facebook.aura.devices.pairing.FittedMuseGadgetNameKt;
import com.facebook.aura.pairs.PairsCodeOutcome;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class PairsRepositoryKt {
    public static final String ACCEPT_INVITATION = "accept_invitation";
    public static final String ACCEPT_PATH = "/peer/accept";
    public static final long ACCEPT_TIMEOUT_SECONDS = 45;
    public static final String ACTIVE_RELATIONSHIP_LIMIT_REACHED = "active_relationship_limit_reached";
    public static final int ACTIVITY_PAGE_LIMIT = 20;
    public static final Set<String> ALREADY_CONFIRMED_CODES;
    public static final String AUDIENCE_CHANGED = "audience_changed";
    public static final String CHANGE_TRUST_PRESET = "change_trust_preset";
    public static final String CONFIRM_SAFETY_CODE = "confirm_safety_code";
    public static final String CREATE_INVITATION = "create_invitation";
    public static final String GOAL_EDIT_APPLIED = "applied";
    public static final long GUIDANCE_WRITE_TIMEOUT_SECONDS = 360;
    public static final Set<String> HISTORY_EVENT_NAMES;
    public static final int HISTORY_PAGE_LIMIT = 20;
    public static final int HTTP_CONFLICT = 409;
    public static final long IMAGE_TIMEOUT_SECONDS = 20;
    public static final Set<String> INBOX_DECLINE_ENDED;
    public static final C06827l3 INBOX_DELIVERY_ID;
    public static final long INBOX_DELIVER_TIMEOUT_SECONDS = 30;
    public static final String INTERNAL_ERROR = "internal_error";
    public static final String INVALID_FRAGMENT = "";
    public static final String INVALID_PARAMS = "invalid_params";
    public static final String INVITE_ALREADY_CLAIMED = "invite_already_claimed";
    public static final String INVITE_GENERATION_UNSUPPORTED = "peer_invite_generation_unsupported";
    public static final String INVITE_OPEN_ALREADY_PAIRED = "already_paired";
    public static final String INVITE_OPEN_POSTED = "posted";
    public static final long INVITE_OPEN_TIMEOUT_SECONDS = 30;
    public static final String INVITE_PHOTOS_PATH = "/api/hatch/peer-invite-photos";
    public static final int MAX_CACHED_IMAGES = 64;
    public static final int MAX_CONCURRENT_NAME_READS = 4;
    public static final int MAX_FRAGMENT_LENGTH = 2048;
    public static final int MAX_HISTORY_TEXT_LENGTH = 4000;
    public static final int MAX_INBOX_ITEMS = 32;
    public static final int MAX_INBOX_MUSE_ID_LENGTH = 128;
    public static final int MAX_INBOX_PERSON_NAME_LENGTH = 256;
    public static final int MAX_NAME_LENGTH = 256;
    public static final int MAX_PAGES = 10;
    public static final int MAX_STAGED_LINKS = 16;
    public static final int MAX_SUGGESTIONS = 60;
    public static final String META_AI_VM_DOMAIN = "metaaivm.com";
    public static final String NO_LIVE_SAS = "no_live_sas";
    public static final String OPEN_INVITE_LIMIT_REACHED = "open_invite_limit_reached";
    public static final int PAGE_LIMIT = 100;
    public static final Set<String> PEER_ACCESS_AVAILABILITIES;
    public static final String PEER_CONTACT_NOT_VERIFIED = "peer_contact_not_verified";
    public static final String PEER_PRESET_UNAVAILABLE = "peer_preset_unavailable";
    public static final String PEER_RELATIONSHIP_EXPIRED = "peer_relationship_expired";
    public static final String PEER_RELATIONSHIP_NOT_FOUND = "peer_relationship_not_found";
    public static final String PEER_RULES_CHANGED = "peer_rules_changed";
    public static final String PEER_STATUS_UNAVAILABLE = "peer_status_unavailable";
    public static final String PEER_TRANSPORT_UNAVAILABLE = "peer_transport_unavailable";
    public static final String READ_SAFETY_CODE = "read_safety_code";
    public static final String RELATIONSHIP_GENERATION_CONFLICT = "peer_relationship_generation_conflict";
    public static final Set<String> REQUEST_CHANGED_CODES;
    public static final int RESOURCES_PAGE_LIMIT = 25;
    public static final Set<Integer> RETRYABLE_SHARE_CODES;
    public static final long SAS_CONFIRM_TIMEOUT_SECONDS = 75;
    public static final int SAS_READ_ATTEMPTS = 6;
    public static final long SAS_RETRY_BASE_MS = 500;
    public static final long SAS_RETRY_MAX_MS = 4000;
    public static final C06827l3 SHA256_HEX;
    public static final String SHARE_SENT_KIND_SUFFIX = "_share_sent";
    public static final List<PairsSuggestionSource> SOURCE_ORDER;
    public static final String SPACE_ONLY_PRESET = "space_only";
    public static final String TAG = "PairsRepository";
    public static final Set<String> TERMINAL_INBOX_REJECTIONS;
    public static final PairsAccess UNAVAILABLE_ACCESS;
    public static final String UNPAIRED = "unpaired";
    public static final Set<String> VM_INGRESS_HOSTS;

    public static final PairsImageRef imageRef(PeerContactJson peerContactJson, PeerImageJson peerImageJson, PeerImageJson peerImageJson2, PairsImageKind pairsImageKind) {
        if (peerImageJson == null) {
            return null;
        }
        return toRef(peerImageJson, peerContactJson.muse_id, pairsImageKind, C7384Etj.areEqual(peerImageJson2 != null ? peerImageJson2.sha256 : null, peerImageJson.sha256));
    }

    public static final PairsImageRef invitePhotoRef(String str) {
        C7384Etj.A0Y(str, 0);
        if (SHA256_HEX.A08(str)) {
            return new PairsImageRef("", str, PairsImageKind.INVITE_PHOTO, true);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.pairs.TrustedCircleSource toSource(com.facebook.aura.pairs.TrustedCircleSourceJson r12) {
        /*
            r8 = r12
            java.lang.String r0 = r12.name
            boolean r0 = X.C7BY.A0j(r0)
            r7 = 0
            if (r0 != 0) goto L23
            java.lang.String r0 = r12.recipient_id
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = r12.sender_account_id
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 != 0) goto L23
            java.lang.String r1 = r12.app_target
            int r0 = r1.hashCode()
            switch(r0) {
                case -1479469166: goto L24;
                case -619954295: goto L2f;
                case 1279756998: goto L3a;
                case 1350486771: goto L45;
                default: goto L23;
            }
        L23:
            return r7
        L24:
            java.lang.String r0 = "INSTAGRAM"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L23
            com.facebook.aura.pairs.PairsSuggestionSource r9 = com.facebook.aura.pairs.PairsSuggestionSource.INSTAGRAM
            goto L4f
        L2f:
            java.lang.String r0 = "THREADS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L23
            com.facebook.aura.pairs.PairsSuggestionSource r9 = com.facebook.aura.pairs.PairsSuggestionSource.THREADS
            goto L4f
        L3a:
            java.lang.String r0 = "FACEBOOK"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L23
            com.facebook.aura.pairs.PairsSuggestionSource r9 = com.facebook.aura.pairs.PairsSuggestionSource.FACEBOOK
            goto L4f
        L45:
            java.lang.String r0 = "MESSENGER"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L23
            com.facebook.aura.pairs.PairsSuggestionSource r9 = com.facebook.aura.pairs.PairsSuggestionSource.MESSENGER
        L4f:
            kotlinx.serialization.json.JsonPrimitive r0 = r12.recipient_type
            java.lang.Integer r0 = X.C9oY.A02(r0)
            java.lang.String r6 = "MSGR_GROUP"
            java.lang.String r5 = "MSGR_CONTACT"
            java.lang.String r4 = "IGD_THREAD"
            java.lang.String r3 = "IGD_USER"
            r2 = 1
            if (r0 != 0) goto L6e
            kotlinx.serialization.json.JsonPrimitive r0 = r12.recipient_type
            java.lang.String r10 = r0.A00()
        L66:
            int r0 = r10.hashCode()
            switch(r0) {
                case -1801456253: goto L85;
                case -1662145855: goto L92;
                case -998481532: goto L94;
                case -990841134: goto L99;
                case -207302223: goto La1;
                default: goto L6d;
            }
        L6d:
            return r7
        L6e:
            int r1 = r0.intValue()
            if (r1 != r2) goto L76
            r10 = r3
            goto L66
        L76:
            r0 = 2
            if (r1 != r0) goto L7b
            r10 = r4
            goto L66
        L7b:
            r0 = 3
            if (r1 != r0) goto L80
            r10 = r5
            goto L66
        L80:
            r0 = 4
            if (r1 != r0) goto L23
            r10 = r6
            goto L66
        L85:
            boolean r0 = r10.equals(r4)
            if (r0 == 0) goto L23
            java.lang.Boolean r0 = r12.is_direct
            boolean r11 = X.AnonymousClass002.A1b(r0, r2)
            goto La8
        L92:
            java.lang.String r3 = "THREADS_USER"
        L94:
            boolean r0 = r10.equals(r3)
            goto L9d
        L99:
            boolean r0 = r10.equals(r5)
        L9d:
            if (r0 == 0) goto L23
            r11 = 1
            goto La8
        La1:
            boolean r0 = r10.equals(r6)
            if (r0 == 0) goto L23
            r11 = 0
        La8:
            java.util.List<com.facebook.aura.pairs.PairsSuggestionSource> r0 = com.facebook.aura.pairs.PairsRepositoryKt.SOURCE_ORDER
            int r12 = r0.indexOf(r9)
            com.facebook.aura.pairs.TrustedCircleSource r7 = new com.facebook.aura.pairs.TrustedCircleSource
            r7.<init>(r8, r9, r10, r11, r12)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepositoryKt.toSource(com.facebook.aura.pairs.TrustedCircleSourceJson):com.facebook.aura.pairs.TrustedCircleSource");
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PairsRelationshipState.values().length];
            try {
                AnonymousClass005.A0v(PairsRelationshipState.VERIFIED, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(PairsRelationshipState.IDENTITY_CHANGED, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PairsError.values().length];
            try {
                AnonymousClass005.A0v(PairsError.SAFETY_CODE_NOT_READY, iArr2, 1);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(PairsError.ALREADY_CONFIRMED, iArr2, 2);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A15(PairsError.CONFLICT, iArr2);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A16(PairsError.GONE, iArr2);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass002.A17(PairsError.NOT_FOUND, iArr2);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass002.A18(PairsError.EXPIRED, iArr2);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1G(PairsError.UNAVAILABLE, iArr2);
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        C0881AGi c0881AGi = C0881AGi.A00;
        UNAVAILABLE_ACCESS = new PairsAccess(false, false, false, false, false, false, c0881AGi, c0881AGi, false);
        PEER_ACCESS_AVAILABILITIES = C60O.A19("enabled", "management_only");
        INBOX_DECLINE_ENDED = C60O.A1A(ConnectionsActivityKt.FILE_STATE_DECLINED, "already_ended", "unknown");
        INBOX_DELIVERY_ID = C06827l3.A02("^[A-Za-z0-9._:-]{1,256}$");
        TERMINAL_INBOX_REJECTIONS = C60O.A1B("invalid", "expired", INVITE_OPEN_ALREADY_PAIRED, ConnectionsActivityKt.FILE_STATE_DECLINED);
        ALREADY_CONFIRMED_CODES = C60O.A19("sas_confirm_request_conflict", "sas_ceremony_unavailable");
        HISTORY_EVENT_NAMES = C60O.A19("message.user", "message.assistant");
        SHA256_HEX = C06827l3.A02("^[0-9a-f]{64}$");
        REQUEST_CHANGED_CODES = C60O.A1A("invite_create_request_conflict", "invite_create_request_terminal", "invite_create_request_generation_unsupported");
        RETRYABLE_SHARE_CODES = BFI.A0H(new Integer[]{408, 429});
        VM_INGRESS_HOSTS = C60O.A19("vm.muse.ai", "vm.meta.ai");
        SOURCE_ORDER = Arrays.asList(PairsSuggestionSource.INSTAGRAM, PairsSuggestionSource.MESSENGER, PairsSuggestionSource.THREADS, PairsSuggestionSource.FACEBOOK);
    }

    public static final String acceptUrl(String str) {
        return FGI.A0M("https://muse.ai/peer/accept#", str);
    }

    public static final Bitmap decodeBounded(byte[] bArr, int i) {
        int i2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i3 = 1;
        options.inJustDecodeBounds = true;
        int length = bArr.length;
        BitmapFactory.decodeByteArray(bArr, 0, length, options);
        int i4 = options.outWidth;
        if (i4 <= 0 || (i2 = options.outHeight) <= 0) {
            return null;
        }
        if (i < 1) {
            i = 1;
        }
        while (true) {
            int i5 = i3 * 2;
            if (Math.min(i4, i2) / i5 < i) {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inSampleSize = i3;
                return BitmapFactory.decodeByteArray(bArr, 0, length, options2);
            }
            i3 = i5;
        }
    }

    public static final String personKey(TrustedCircleSource trustedCircleSource) {
        StringBuilder sbA0x;
        String str = trustedCircleSource.json.account_center_key;
        if (str == null || C7BY.A0j(str)) {
            TrustedCircleSourceJson trustedCircleSourceJson = trustedCircleSource.json;
            String str2 = trustedCircleSourceJson.app_target;
            String str3 = trustedCircleSourceJson.sender_account_id;
            str = trustedCircleSourceJson.recipient_id;
            sbA0x = C3cI.A0x("source:", str2);
            C60O.A1R(":", str3, sbA0x);
        } else {
            sbA0x = C60O.A0x("center:");
        }
        return AnonymousClass001.A0v(str, sbA0x);
    }

    public static final String safePhotoUrl(TrustedCircleSourceJson trustedCircleSourceJson) {
        String next;
        Iterator<String> it = trustedCircleSourceJson.profile_pic_url.iterator();
        while (true) {
            next = null;
            if (!it.hasNext()) {
                break;
            }
            next = it.next();
            Uri uri = Uri.parse(next);
            String strA0i = C60Q.A0i(uri.getHost());
            String scheme = uri.getScheme();
            if (scheme != null && scheme.equalsIgnoreCase("https") && strA0i != null && !strA0i.equals("metaaivm.com") && !strA0i.endsWith(".metaaivm.com") && !VM_INGRESS_HOSTS.contains(strA0i)) {
                break;
            }
        }
        return next;
    }

    public static final String sha256Hex(byte[] bArr) {
        byte[] bArrDigest = MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256).digest(bArr);
        C7384Etj.A0U(bArrDigest);
        return PairsInvitePreviewKt.toHex(bArrDigest);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.pairs.PairsContact toContact(com.facebook.aura.pairs.PeerContactJson r32, long r33) {
        /*
            r0 = r32
            java.lang.Long r1 = r0.request_expires_at_ms
            r5 = 3
            if (r1 == 0) goto L10
            long r3 = r1.longValue()
            int r2 = (r3 > r33 ? 1 : (r3 == r33 ? 0 : -1))
            r4 = 1
            if (r2 <= 0) goto L11
        L10:
            r4 = 0
        L11:
            java.lang.String r2 = r0.status
            com.facebook.aura.pairs.PairsRelationshipState r21 = relationshipState(r2)
            r20 = 0
            if (r21 != 0) goto L1c
            return r20
        L1c:
            int r3 = r21.ordinal()
            if (r3 == r5) goto Lcd
            r2 = 4
            if (r3 == r2) goto Lc9
            if (r4 == 0) goto Lc5
            com.facebook.aura.pairs.PairsContactStatus r14 = com.facebook.aura.pairs.PairsContactStatus.EXPIRED
        L29:
            java.lang.String r2 = r0.relationship_generation_id
            java.lang.Long r4 = r0.relationship_started_at_ms
            java.lang.String r11 = r0.muse_id
            java.lang.String r3 = r0.display_name
            java.lang.String r12 = X.AnonymousClass002.A0l(r3)
            java.lang.String r3 = r0.agent_name
            java.lang.String r13 = X.AnonymousClass002.A0l(r3)
            com.facebook.aura.pairs.PairsLevel$Companion r5 = com.facebook.aura.pairs.PairsLevel.Companion
            java.lang.String r3 = r0.trust_preset
            com.facebook.aura.pairs.PairsLevel r15 = r5.fromWire(r3)
            java.lang.String r5 = r0.trust_preset
            java.lang.String r3 = "space_only"
            boolean r26 = r3.equals(r5)
            com.facebook.aura.pairs.PeerImageJson r6 = r0.profile_photo_ref
            com.facebook.aura.pairs.PeerImageJson r5 = r0.profile_photo
            com.facebook.aura.pairs.PairsImageKind r3 = com.facebook.aura.pairs.PairsImageKind.PHOTO
            com.facebook.aura.pairs.PairsImageRef r16 = imageRef(r0, r6, r5, r3)
            com.facebook.aura.pairs.PeerImageJson r6 = r0.muse_avatar_ref
            com.facebook.aura.pairs.PeerImageJson r5 = r0.muse_avatar
            com.facebook.aura.pairs.PairsImageKind r3 = com.facebook.aura.pairs.PairsImageKind.AVATAR
            com.facebook.aura.pairs.PairsImageRef r17 = imageRef(r0, r6, r5, r3)
            java.lang.String r5 = r0.chat_session_id
            if (r5 == 0) goto Lc2
            boolean r3 = X.C7BY.A0j(r5)
            if (r3 != 0) goto Lc2
        L69:
            com.facebook.aura.pairs.PeerLastActivityJson r3 = r0.last_activity
            r9 = 0
            if (r3 == 0) goto Lbf
            long r6 = r3.at_ms
            java.lang.Long r19 = java.lang.Long.valueOf(r6)
            long r6 = r19.longValue()
            int r3 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r3 <= 0) goto Lbf
        L7d:
            java.lang.Long r3 = r0.paired_at_ms
            if (r3 == 0) goto Lbc
            long r7 = r3.longValue()
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 <= 0) goto Lbc
        L89:
            if (r2 == 0) goto La4
            if (r4 == 0) goto La4
            if (r1 == 0) goto La4
            long r6 = r0.relationship_revision
            long r31 = r4.longValue()
            long r33 = r1.longValue()
            com.facebook.aura.pairs.PairsRelationship r20 = new com.facebook.aura.pairs.PairsRelationship
            r27 = r20
            r28 = r2
            r29 = r6
            r27.<init>(r28, r29, r31, r33)
        La4:
            boolean r2 = r0.sas_confirmed_local
            boolean r1 = r0.attested
            java.lang.Long r0 = r0.request_expires_at_ms
            r27 = 0
            com.facebook.aura.pairs.PairsContact r10 = new com.facebook.aura.pairs.PairsContact
            r22 = r2
            r23 = r1
            r24 = r0
            r25 = r3
            r18 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r10
        Lbc:
            r3 = r20
            goto L89
        Lbf:
            r19 = r20
            goto L7d
        Lc2:
            r5 = r20
            goto L69
        Lc5:
            com.facebook.aura.pairs.PairsContactStatus r14 = com.facebook.aura.pairs.PairsContactStatus.IN_PROGRESS
            goto L29
        Lc9:
            com.facebook.aura.pairs.PairsContactStatus r14 = com.facebook.aura.pairs.PairsContactStatus.IDENTITY_CHANGED
            goto L29
        Lcd:
            com.facebook.aura.pairs.PairsContactStatus r14 = com.facebook.aura.pairs.PairsContactStatus.VERIFIED
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepositoryKt.toContact(com.facebook.aura.pairs.PeerContactJson, long):com.facebook.aura.pairs.PairsContact");
    }

    public static final PairsContact toDirectoryContact(ConnectionDirectoryEntryJson connectionDirectoryEntryJson) {
        ConnectionContactJson connectionContactJson;
        PairsRelationshipState pairsRelationshipStateRelationshipState;
        PairsImageRef ref;
        PairsImageRef ref2;
        String str = connectionDirectoryEntryJson.muse_id;
        if (str == null || str.length() <= 0 || (connectionContactJson = connectionDirectoryEntryJson.contact) == null || !connectionDirectoryEntryJson.active || connectionDirectoryEntryJson.space_only || (pairsRelationshipStateRelationshipState = relationshipState(connectionContactJson.status)) == null) {
            return null;
        }
        String strA0l = AnonymousClass002.A0l(connectionContactJson.display_name);
        if (strA0l.length() == 0) {
            strA0l = AnonymousClass002.A0l(connectionDirectoryEntryJson.display_name);
        }
        String strA0l2 = AnonymousClass002.A0l(connectionContactJson.agent_name);
        if (strA0l2.length() == 0) {
            String str2 = connectionDirectoryEntryJson.agent_name;
            if (str2 == null) {
                str2 = "";
            }
            strA0l2 = AnonymousClass002.A0l(str2);
        }
        int iOrdinal = pairsRelationshipStateRelationshipState.ordinal();
        PairsContactStatus pairsContactStatus = iOrdinal != 3 ? iOrdinal != 4 ? PairsContactStatus.IN_PROGRESS : PairsContactStatus.IDENTITY_CHANGED : PairsContactStatus.VERIFIED;
        PeerImageJson peerImageJson = connectionContactJson.profile_photo_ref;
        if (peerImageJson != null) {
            PairsImageKind pairsImageKind = PairsImageKind.PHOTO;
            PeerImageJson peerImageJson2 = connectionContactJson.profile_photo;
            ref = toRef(peerImageJson, str, pairsImageKind, C7384Etj.areEqual(peerImageJson2 != null ? peerImageJson2.sha256 : null, peerImageJson.sha256));
        } else {
            ref = null;
        }
        PeerImageJson peerImageJson3 = connectionContactJson.muse_avatar_ref;
        if (peerImageJson3 != null) {
            PairsImageKind pairsImageKind2 = PairsImageKind.AVATAR;
            PeerImageJson peerImageJson4 = connectionContactJson.muse_avatar;
            ref2 = toRef(peerImageJson3, str, pairsImageKind2, C7384Etj.areEqual(peerImageJson4 != null ? peerImageJson4.sha256 : null, peerImageJson3.sha256));
        } else {
            ref2 = null;
        }
        String str3 = connectionDirectoryEntryJson.chat_session_id;
        if (str3 == null || C7BY.A0j(str3)) {
            str3 = null;
        }
        String str4 = connectionDirectoryEntryJson.connection_id;
        String str5 = null;
        if (str4.length() > 0) {
            str5 = str4;
        }
        return new PairsContact(str, strA0l, strA0l2, pairsContactStatus, null, ref, ref2, str3, null, null, pairsRelationshipStateRelationshipState, false, false, null, null, false, str5);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[PHI: r3
  0x0043: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v1 java.lang.String) binds: [B:42:0x0090, B:20:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.pairs.PairsHistoryMessage toHistoryMessage(com.facebook.aura.pairs.PeerChatEventJson r10) {
        /*
            com.facebook.aura.pairs.PeerChatAuthorJson r3 = r10.author
            r4 = 0
            if (r3 != 0) goto L6
            return r4
        L6:
            X.Ey9 r0 = com.facebook.aura.pairs.PairsHistoryAuthor.getEntries()
            java.util.Iterator r2 = r0.iterator()
        Le:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r7 = r2.next()
            r0 = r7
            com.facebook.aura.pairs.PairsHistoryAuthor r0 = (com.facebook.aura.pairs.PairsHistoryAuthor) r0
            java.lang.String r1 = r0.getWireValue()
            java.lang.String r0 = r3.kind
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto Le
        L27:
            com.facebook.aura.pairs.PairsHistoryAuthor r7 = (com.facebook.aura.pairs.PairsHistoryAuthor) r7
            if (r7 != 0) goto L2e
            return r4
        L2c:
            r7 = r4
            goto L27
        L2e:
            java.util.Set<java.lang.String> r1 = com.facebook.aura.pairs.PairsRepositoryKt.HISTORY_EVENT_NAMES
            java.lang.String r0 = r10.event_name
            boolean r0 = X.AbstractC0878AGe.A0k(r1, r0)
            if (r0 != 0) goto L39
            return r4
        L39:
            java.lang.String r3 = r10.display_text
            if (r3 == 0) goto L74
            boolean r0 = X.C7BY.A0j(r3)
            if (r0 != 0) goto L74
        L43:
            boolean r0 = X.C7BY.A0j(r3)
            if (r0 != 0) goto L95
            java.lang.String r0 = r10.message_id
            if (r0 == 0) goto L6b
            java.lang.String r4 = X.AnonymousClass002.A0l(r0)
            if (r4 == 0) goto L6b
            int r0 = r4.length()
            if (r0 <= 0) goto L6b
        L59:
            long r5 = r10.seq
            java.lang.String r0 = X.AnonymousClass002.A0l(r3)
            java.lang.String r8 = truncatedHistoryText(r0)
            long r9 = r10.occurred_at_ms
            com.facebook.aura.pairs.PairsHistoryMessage r3 = new com.facebook.aura.pairs.PairsHistoryMessage
            r3.<init>(r4, r5, r7, r8, r9)
            return r3
        L6b:
            long r1 = r10.seq
            java.lang.String r0 = "seq:"
            java.lang.String r4 = X.FGI.A0B(r1, r0)
            goto L59
        L74:
            kotlinx.serialization.json.JsonObject r1 = r10.payload
            if (r1 == 0) goto L93
            java.lang.String r0 = "content"
            kotlinx.serialization.json.JsonElement r1 = X.C60O.A1F(r0, r1)
        L7e:
            boolean r0 = r1 instanceof kotlinx.serialization.json.JsonPrimitive
            if (r0 == 0) goto L95
            kotlinx.serialization.json.JsonPrimitive r1 = (kotlinx.serialization.json.JsonPrimitive) r1
            if (r1 == 0) goto L95
            boolean r0 = r1.A01()
            if (r0 == 0) goto L95
            java.lang.String r3 = r1.A00()
            if (r3 == 0) goto L95
            goto L43
        L93:
            r1 = r4
            goto L7e
        L95:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepositoryKt.toHistoryMessage(com.facebook.aura.pairs.PeerChatEventJson):com.facebook.aura.pairs.PairsHistoryMessage");
    }

    public static final PairsInboxRequest toInboxRequest(PeerInboxItemJson peerInboxItemJson, long j) {
        int length;
        if (!INBOX_DELIVERY_ID.A08(peerInboxItemJson.delivery_id) || (length = peerInboxItemJson.muse_id.length()) == 0 || length > 128 || peerInboxItemJson.expires_at_ms <= j || PairsLevel.Companion.fromWire(peerInboxItemJson.level) == null) {
            return null;
        }
        String str = peerInboxItemJson.delivery_id;
        String str2 = peerInboxItemJson.person_name;
        String strPeerDisplayText = str2 != null ? PairsTextKt.peerDisplayText(str2, 256) : null;
        String str3 = peerInboxItemJson.muse_id;
        long j2 = peerInboxItemJson.expires_at_ms;
        String str4 = peerInboxItemJson.person_photo_sha256;
        return new PairsInboxRequest(str, strPeerDisplayText, str3, j2, str4 != null ? invitePhotoRef(str4) : null, peerInboxItemJson.received_at_ms);
    }

    public static final PairsInvite toInvite(PeerInviteJson peerInviteJson, boolean z) {
        return new PairsInvite(peerInviteJson.invite_id_b64, peerInviteJson.create_request_id, AnonymousClass002.A0l(peerInviteJson.label), peerInviteJson.offered_preset, peerInviteJson.expires_at_ms, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Throwable toPairsException(java.lang.Throwable r3, java.lang.String r4) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepositoryKt.toPairsException(java.lang.Throwable, java.lang.String):java.lang.Throwable");
    }

    public static final PairsImageRef toRef(PeerImageJson peerImageJson, String str, PairsImageKind pairsImageKind, boolean z) {
        if (!SHA256_HEX.A08(peerImageJson.sha256)) {
            return null;
        }
        int maxBytes = pairsImageKind.getMaxBytes();
        long j = peerImageJson.byte_length;
        if (1 > j || j > maxBytes) {
            return null;
        }
        return new PairsImageRef(str, peerImageJson.sha256, pairsImageKind, z);
    }

    public static final String wire(PairsLevel pairsLevel, boolean z) {
        return (pairsLevel == PairsLevel.ACT_FREELY && z) ? PairsLevel.LEGACY_COLLABORATOR : pairsLevel.getWireValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.facebook.aura.pairs.PairsSuggestion> groupedPeople(java.util.List<com.facebook.aura.pairs.TrustedCircleSource> r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepositoryKt.groupedPeople(java.util.List):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isValidFragment(java.lang.String r6) {
        /*
            int r5 = r6.length()
            r4 = 0
            if (r5 <= 0) goto L3a
            r0 = 2048(0x800, float:2.87E-42)
            if (r5 > r0) goto L3a
            int r0 = r5 % 4
            r3 = 1
            if (r0 == r3) goto L3a
            r2 = 0
        L11:
            char r1 = r6.charAt(r2)
            r0 = 65
            if (r0 > r1) goto L2f
            r0 = 91
            if (r1 < r0) goto L25
            r0 = 97
            if (r0 > r1) goto L2a
            r0 = 123(0x7b, float:1.72E-43)
        L23:
            if (r1 >= r0) goto L3a
        L25:
            int r2 = r2 + 1
            if (r2 < r5) goto L11
            return r3
        L2a:
            r0 = 95
            if (r1 != r0) goto L3a
            goto L25
        L2f:
            r0 = 48
            if (r0 > r1) goto L36
            r0 = 58
            goto L23
        L36:
            r0 = 45
            if (r1 == r0) goto L25
        L3a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepositoryKt.isValidFragment(java.lang.String):boolean");
    }

    public static final PairsRelationshipState relationshipState(String str) {
        switch (str.hashCode()) {
            case -2050604405:
                if (str.equals("confirmed_local")) {
                    return PairsRelationshipState.CONFIRMED_LOCAL;
                }
                return null;
            case -1994383672:
                if (str.equals("verified")) {
                    return PairsRelationshipState.VERIFIED;
                }
                return null;
            case -682587753:
                if (str.equals(PairsPendingLevelStoreKt.STATE_PENDING)) {
                    return PairsRelationshipState.PENDING;
                }
                return null;
            case 109591538:
                if (str.equals("awaiting_sas")) {
                    return PairsRelationshipState.AWAITING_SAS;
                }
                return null;
            case 1138613299:
                if (str.equals("identity_changed")) {
                    return PairsRelationshipState.IDENTITY_CHANGED;
                }
                return null;
            default:
                return null;
        }
    }

    public static final PairsCodeOutcome toCodeOutcome(PairsError pairsError) {
        PairsCodeOutcome pairsCodeOutcome;
        switch (pairsError.ordinal()) {
            case 0:
                pairsCodeOutcome = PairsCodeOutcome.Unavailable.INSTANCE;
                break;
            case 1:
            case 9:
                pairsCodeOutcome = PairsCodeOutcome.Gone.INSTANCE;
                break;
            case 2:
            case 4:
            case 5:
            case 6:
            default:
                pairsCodeOutcome = PairsCodeOutcome.Failed.INSTANCE;
                break;
            case 3:
            case 8:
                pairsCodeOutcome = PairsCodeOutcome.AlreadyConfirmed.INSTANCE;
                break;
            case 7:
                pairsCodeOutcome = PairsCodeOutcome.NotReady.INSTANCE;
                break;
            case 10:
                pairsCodeOutcome = PairsCodeOutcome.Expired.INSTANCE;
                break;
        }
        return pairsCodeOutcome;
    }

    public static final String truncatedHistoryText(String str) {
        return str.length() > 4000 ? FGI.A0M(BQG.A17(str, 4000), FittedMuseGadgetNameKt.ELLIPSIS) : str;
    }
}
