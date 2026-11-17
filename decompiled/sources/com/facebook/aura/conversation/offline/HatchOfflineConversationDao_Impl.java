package com.facebook.aura.conversation.offline;

import X.AbstractC6599EJb;
import X.BV4;
import X.BV5;
import X.BV7;
import X.C3cG;
import X.C60O;
import X.EIK;
import X.EIN;
import X.EJ1;
import X.EJV;
import X.EJY;
import X.G0U;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class HatchOfflineConversationDao_Impl extends HatchOfflineConversationDao {
    public final EIN __db;
    public final EJY<HatchOfflineMessageEntity> __insertAdapterOfHatchOfflineMessageEntity = new EJY<HatchOfflineMessageEntity>() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationDao_Impl.1
        @Override // X.EJY
        public void bind(EIK eik, HatchOfflineMessageEntity hatchOfflineMessageEntity) {
            eik.A5F(1, hatchOfflineMessageEntity.vmId);
            eik.A5F(2, hatchOfflineMessageEntity.sessionId);
            eik.A5C(3, hatchOfflineMessageEntity.seq);
            eik.A5C(4, hatchOfflineMessageEntity.timestamp);
            String str = hatchOfflineMessageEntity.serverMessageId;
            if (str == null) {
                eik.A5D(5);
            } else {
                eik.A5F(5, str);
            }
            eik.A5F(6, hatchOfflineMessageEntity.role);
            eik.A5A(7, hatchOfflineMessageEntity.json);
        }

        @Override // X.EJY
        public String createQuery() {
            return "INSERT OR REPLACE INTO `offline_messages` (`vm_id`,`session_id`,`seq`,`timestamp`,`server_message_id`,`role`,`json`) VALUES (?,?,?,?,?,?,?)";
        }
    };
    public final EJY<HatchOfflineThreadEntity> __insertAdapterOfHatchOfflineThreadEntity = new EJY<HatchOfflineThreadEntity>() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationDao_Impl.2
        @Override // X.EJY
        public void bind(EIK eik, HatchOfflineThreadEntity hatchOfflineThreadEntity) {
            eik.A5F(1, hatchOfflineThreadEntity.vmId);
            eik.A5F(2, hatchOfflineThreadEntity.sessionId);
            byte[] bArr = hatchOfflineThreadEntity.title;
            if (bArr == null) {
                eik.A5D(3);
            } else {
                eik.A5A(3, bArr);
            }
            byte[] bArr2 = hatchOfflineThreadEntity.snippet;
            if (bArr2 == null) {
                eik.A5D(4);
            } else {
                eik.A5A(4, bArr2);
            }
            eik.A5C(5, hatchOfflineThreadEntity.createdAt);
            eik.A5C(6, hatchOfflineThreadEntity.updatedAt);
            eik.A5C(7, hatchOfflineThreadEntity.isThread ? 1L : 0L);
            eik.A5F(8, hatchOfflineThreadEntity.status);
            eik.A5C(9, hatchOfflineThreadEntity.unreadCount);
            eik.A5C(10, hatchOfflineThreadEntity.isPinned ? 1L : 0L);
            eik.A5C(11, hatchOfflineThreadEntity.lastOpenedAt);
            String str = hatchOfflineThreadEntity.channel;
            if (str == null) {
                eik.A5D(12);
            } else {
                eik.A5F(12, str);
            }
            byte[] bArr3 = hatchOfflineThreadEntity.accountUsername;
            if (bArr3 == null) {
                eik.A5D(13);
            } else {
                eik.A5A(13, bArr3);
            }
            eik.A5C(14, hatchOfflineThreadEntity.canSendMessages ? 1L : 0L);
        }

        @Override // X.EJY
        public String createQuery() {
            return "INSERT OR REPLACE INTO `offline_threads` (`vm_id`,`session_id`,`title`,`snippet`,`created_at`,`updated_at`,`is_thread`,`status`,`unread_count`,`is_pinned`,`last_opened_at`,`channel`,`account_username`,`can_send_messages`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    };
    public final EJY<HatchOfflineKeyEntity> __insertAdapterOfHatchOfflineKeyEntity = new EJY<HatchOfflineKeyEntity>() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationDao_Impl.3
        @Override // X.EJY
        public void bind(EIK eik, HatchOfflineKeyEntity hatchOfflineKeyEntity) {
            eik.A5C(1, hatchOfflineKeyEntity.id);
            eik.A5A(2, hatchOfflineKeyEntity.wrappedKey);
        }

        @Override // X.EJY
        public String createQuery() {
            return "INSERT OR REPLACE INTO `offline_keys` (`id`,`wrapped_key`) VALUES (?,?)";
        }
    };

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ Object lambda$clearAllDataKeys$0(EJV ejv) {
        EIK eikAYO = ejv.AYO("DELETE FROM offline_keys");
        try {
            eikAYO.AgN();
            eikAYO.close();
            return null;
        } catch (Throwable th) {
            eikAYO.close();
            throw th;
        }
    }

    public static /* synthetic */ Object lambda$clearAllMessages$0(EJV ejv) {
        EIK eikAYO = ejv.AYO("DELETE FROM offline_messages");
        try {
            eikAYO.AgN();
            eikAYO.close();
            return null;
        } catch (Throwable th) {
            eikAYO.close();
            throw th;
        }
    }

    public static /* synthetic */ Object lambda$clearAllThreads$0(EJV ejv) {
        EIK eikAYO = ejv.AYO("DELETE FROM offline_threads");
        try {
            eikAYO.AgN();
            eikAYO.close();
            return null;
        } catch (Throwable th) {
            eikAYO.close();
            throw th;
        }
    }

    public static /* synthetic */ Object lambda$deleteMessagesExceptVm$0(String str, EJV ejv) {
        EIK eikAYO = ejv.AYO("DELETE FROM offline_messages WHERE vm_id != ?");
        try {
            eikAYO.A5F(1, str);
            eikAYO.AgN();
            eikAYO.close();
            return null;
        } catch (Throwable th) {
            eikAYO.close();
            throw th;
        }
    }

    public static /* synthetic */ Object lambda$deleteMessagesForEvictedThreads$0(String str, String str2, int i, EJV ejv) {
        EIK eikAYO = ejv.AYO("DELETE FROM offline_messages WHERE vm_id = ? AND session_id != ? AND session_id NOT IN (SELECT session_id FROM offline_threads WHERE vm_id = ? ORDER BY last_opened_at DESC LIMIT ?)");
        try {
            EIK.A09(eikAYO, str, str2);
            eikAYO.A5F(3, str);
            eikAYO.A5C(4, i);
            eikAYO.AgN();
            eikAYO.close();
            return null;
        } catch (Throwable th) {
            eikAYO.close();
            throw th;
        }
    }

    public static /* synthetic */ Object lambda$deleteMessagesForSession$0(String str, String str2, EJV ejv) {
        EIK eikAYO = ejv.AYO("DELETE FROM offline_messages WHERE vm_id = ? AND session_id = ?");
        try {
            EIK.A09(eikAYO, str, str2);
            eikAYO.AgN();
            eikAYO.close();
            return null;
        } catch (Throwable th) {
            eikAYO.close();
            throw th;
        }
    }

    public static /* synthetic */ Object lambda$deleteThread$0(String str, String str2, EJV ejv) {
        EIK eikAYO = ejv.AYO("DELETE FROM offline_threads WHERE vm_id = ? AND session_id = ?");
        try {
            EIK.A09(eikAYO, str, str2);
            eikAYO.AgN();
            eikAYO.close();
            return null;
        } catch (Throwable th) {
            eikAYO.close();
            throw th;
        }
    }

    public static /* synthetic */ Object lambda$deleteThreadsBeyondLru$0(String str, int i, EJV ejv) {
        EIK eikAYO = ejv.AYO("DELETE FROM offline_threads WHERE vm_id = ? AND session_id NOT IN (SELECT session_id FROM offline_threads WHERE vm_id = ? ORDER BY last_opened_at DESC LIMIT ?)");
        try {
            eikAYO.A5F(1, str);
            eikAYO.A5F(2, str);
            eikAYO.A5C(3, i);
            eikAYO.AgN();
            eikAYO.close();
            return null;
        } catch (Throwable th) {
            eikAYO.close();
            throw th;
        }
    }

    public static /* synthetic */ Object lambda$deleteThreadsExceptVm$0(String str, EJV ejv) {
        EIK eikAYO = ejv.AYO("DELETE FROM offline_threads WHERE vm_id != ?");
        try {
            eikAYO.A5F(1, str);
            eikAYO.AgN();
            eikAYO.close();
            return null;
        } catch (Throwable th) {
            eikAYO.close();
            throw th;
        }
    }

    public static /* synthetic */ HatchOfflineThreadEntity lambda$getThread$0(String str, String str2, EJV ejv) {
        EIK eikAYO = ejv.AYO("SELECT * FROM offline_threads WHERE vm_id = ? AND session_id = ? LIMIT 1");
        try {
            EIK.A09(eikAYO, str, str2);
            int iA00 = EJ1.A00(eikAYO, "vm_id");
            int iA002 = EJ1.A00(eikAYO, "session_id");
            int iA003 = EJ1.A00(eikAYO, "title");
            int iA004 = EJ1.A00(eikAYO, "snippet");
            int iA005 = EJ1.A00(eikAYO, "created_at");
            int iA006 = EJ1.A00(eikAYO, "updated_at");
            int iA007 = EJ1.A00(eikAYO, "is_thread");
            int iA008 = EJ1.A00(eikAYO, AuraDeeplinkRouteMapper.STATUS_ROUTE);
            int iA009 = EJ1.A00(eikAYO, "unread_count");
            int iA0010 = EJ1.A00(eikAYO, "is_pinned");
            int iA0011 = EJ1.A00(eikAYO, "last_opened_at");
            int iA0012 = EJ1.A00(eikAYO, "channel");
            int iA0013 = EJ1.A00(eikAYO, "account_username");
            int iA0014 = EJ1.A00(eikAYO, "can_send_messages");
            HatchOfflineThreadEntity hatchOfflineThreadEntity = null;
            if (eikAYO.AgN()) {
                hatchOfflineThreadEntity = new HatchOfflineThreadEntity(eikAYO.ALa(iA00), eikAYO.ALa(iA002), eikAYO.isNull(iA003) ? null : eikAYO.getBlob(iA003), eikAYO.isNull(iA004) ? null : eikAYO.getBlob(iA004), eikAYO.getLong(iA005), eikAYO.getLong(iA006), BV7.A1U(eikAYO.getLong(iA007)), eikAYO.ALa(iA008), EIK.A00(eikAYO, iA009), BV7.A1U(eikAYO.getLong(iA0010)), eikAYO.getLong(iA0011), eikAYO.isNull(iA0012) ? null : eikAYO.ALa(iA0012), eikAYO.isNull(iA0013) ? null : eikAYO.getBlob(iA0013), BV7.A1U(eikAYO.getLong(iA0014)));
            }
            return hatchOfflineThreadEntity;
        } finally {
            eikAYO.close();
        }
    }

    public static /* synthetic */ HatchOfflineKeyEntity lambda$loadDataKey$0(int i, EJV ejv) {
        EIK eikAYO = ejv.AYO("SELECT * FROM offline_keys WHERE id = ?");
        try {
            eikAYO.A5C(1, i);
            return eikAYO.AgN() ? new HatchOfflineKeyEntity(EIK.A00(eikAYO, EJ1.A00(eikAYO, "id")), eikAYO.getBlob(EJ1.A00(eikAYO, "wrapped_key"))) : null;
        } finally {
            eikAYO.close();
        }
    }

    public static /* synthetic */ List lambda$loadLatestMessages$0(String str, String str2, int i, EJV ejv) {
        EIK eikAYO = ejv.AYO("SELECT * FROM offline_messages WHERE vm_id = ? AND session_id = ? ORDER BY seq DESC LIMIT ?");
        try {
            EIK.A09(eikAYO, str, str2);
            eikAYO.A5C(3, i);
            int iA00 = EJ1.A00(eikAYO, "vm_id");
            int iA002 = EJ1.A00(eikAYO, "session_id");
            int iA003 = EJ1.A00(eikAYO, AgeCheckFunnelLogging.KEY_SEQ);
            int iA004 = EJ1.A00(eikAYO, "timestamp");
            int iA005 = EJ1.A00(eikAYO, "server_message_id");
            int iA006 = EJ1.A00(eikAYO, "role");
            int iA007 = EJ1.A00(eikAYO, "json");
            ArrayList arrayListA0h = C3cG.A0h();
            while (eikAYO.AgN()) {
                arrayListA0h.add(new HatchOfflineMessageEntity(eikAYO.ALa(iA00), eikAYO.ALa(iA002), eikAYO.getLong(iA003), eikAYO.getLong(iA004), eikAYO.isNull(iA005) ? null : eikAYO.ALa(iA005), eikAYO.ALa(iA006), eikAYO.getBlob(iA007)));
            }
            return arrayListA0h;
        } finally {
            eikAYO.close();
        }
    }

    public static /* synthetic */ HatchOfflineMessageEntity lambda$loadMessage$0(String str, String str2, long j, EJV ejv) {
        EIK eikAYO = ejv.AYO("SELECT * FROM offline_messages WHERE vm_id = ? AND session_id = ? AND seq = ? LIMIT 1");
        try {
            EIK.A09(eikAYO, str, str2);
            eikAYO.A5C(3, j);
            int iA00 = EJ1.A00(eikAYO, "vm_id");
            int iA002 = EJ1.A00(eikAYO, "session_id");
            int iA003 = EJ1.A00(eikAYO, AgeCheckFunnelLogging.KEY_SEQ);
            int iA004 = EJ1.A00(eikAYO, "timestamp");
            int iA005 = EJ1.A00(eikAYO, "server_message_id");
            int iA006 = EJ1.A00(eikAYO, "role");
            int iA007 = EJ1.A00(eikAYO, "json");
            HatchOfflineMessageEntity hatchOfflineMessageEntity = null;
            if (eikAYO.AgN()) {
                hatchOfflineMessageEntity = new HatchOfflineMessageEntity(eikAYO.ALa(iA00), eikAYO.ALa(iA002), eikAYO.getLong(iA003), eikAYO.getLong(iA004), eikAYO.isNull(iA005) ? null : eikAYO.ALa(iA005), eikAYO.ALa(iA006), eikAYO.getBlob(iA007));
            }
            return hatchOfflineMessageEntity;
        } finally {
            eikAYO.close();
        }
    }

    public static /* synthetic */ List lambda$loadMessagesBefore$0(String str, String str2, long j, int i, EJV ejv) {
        EIK eikAYO = ejv.AYO("SELECT * FROM offline_messages WHERE vm_id = ? AND session_id = ? AND seq < ? ORDER BY seq DESC LIMIT ?");
        try {
            EIK.A09(eikAYO, str, str2);
            eikAYO.A5C(3, j);
            eikAYO.A5C(4, i);
            int iA00 = EJ1.A00(eikAYO, "vm_id");
            int iA002 = EJ1.A00(eikAYO, "session_id");
            int iA003 = EJ1.A00(eikAYO, AgeCheckFunnelLogging.KEY_SEQ);
            int iA004 = EJ1.A00(eikAYO, "timestamp");
            int iA005 = EJ1.A00(eikAYO, "server_message_id");
            int iA006 = EJ1.A00(eikAYO, "role");
            int iA007 = EJ1.A00(eikAYO, "json");
            ArrayList arrayListA0h = C3cG.A0h();
            while (eikAYO.AgN()) {
                arrayListA0h.add(new HatchOfflineMessageEntity(eikAYO.ALa(iA00), eikAYO.ALa(iA002), eikAYO.getLong(iA003), eikAYO.getLong(iA004), eikAYO.isNull(iA005) ? null : eikAYO.ALa(iA005), eikAYO.ALa(iA006), eikAYO.getBlob(iA007)));
            }
            return arrayListA0h;
        } finally {
            eikAYO.close();
        }
    }

    public static /* synthetic */ List lambda$loadThreads$0(String str, EJV ejv) {
        EIK eikAYO = ejv.AYO("SELECT * FROM offline_threads WHERE vm_id = ? ORDER BY last_opened_at DESC");
        try {
            eikAYO.A5F(1, str);
            int iA00 = EJ1.A00(eikAYO, "vm_id");
            int iA002 = EJ1.A00(eikAYO, "session_id");
            int iA003 = EJ1.A00(eikAYO, "title");
            int iA004 = EJ1.A00(eikAYO, "snippet");
            int iA005 = EJ1.A00(eikAYO, "created_at");
            int iA006 = EJ1.A00(eikAYO, "updated_at");
            int iA007 = EJ1.A00(eikAYO, "is_thread");
            int iA008 = EJ1.A00(eikAYO, AuraDeeplinkRouteMapper.STATUS_ROUTE);
            int iA009 = EJ1.A00(eikAYO, "unread_count");
            int iA0010 = EJ1.A00(eikAYO, "is_pinned");
            int iA0011 = EJ1.A00(eikAYO, "last_opened_at");
            int iA0012 = EJ1.A00(eikAYO, "channel");
            int iA0013 = EJ1.A00(eikAYO, "account_username");
            int iA0014 = EJ1.A00(eikAYO, "can_send_messages");
            ArrayList arrayListA0h = C3cG.A0h();
            while (eikAYO.AgN()) {
                arrayListA0h.add(new HatchOfflineThreadEntity(eikAYO.ALa(iA00), eikAYO.ALa(iA002), eikAYO.isNull(iA003) ? null : eikAYO.getBlob(iA003), eikAYO.isNull(iA004) ? null : eikAYO.getBlob(iA004), eikAYO.getLong(iA005), eikAYO.getLong(iA006), BV7.A1U(eikAYO.getLong(iA007)), eikAYO.ALa(iA008), EIK.A00(eikAYO, iA009), BV7.A1U(eikAYO.getLong(iA0010)), eikAYO.getLong(iA0011), eikAYO.isNull(iA0012) ? null : eikAYO.ALa(iA0012), eikAYO.isNull(iA0013) ? null : eikAYO.getBlob(iA0013), BV7.A1U(eikAYO.getLong(iA0014))));
            }
            return arrayListA0h;
        } finally {
            eikAYO.close();
        }
    }

    public static /* synthetic */ String lambda$oldestEvictableThread$0(String str, String str2, EJV ejv) {
        EIK eikAYO = ejv.AYO("SELECT session_id FROM offline_threads WHERE vm_id = ? AND session_id != ? ORDER BY last_opened_at ASC LIMIT 1");
        try {
            EIK.A09(eikAYO, str, str2);
            String strALa = null;
            if (eikAYO.AgN() && !eikAYO.isNull(0)) {
                strALa = eikAYO.ALa(0);
            }
            return strALa;
        } finally {
            eikAYO.close();
        }
    }

    public static /* synthetic */ Long lambda$totalJsonBytes$0(String str, EJV ejv) {
        EIK eikAYO = ejv.AYO("SELECT COALESCE(SUM(LENGTH(json)), 0) FROM offline_messages WHERE vm_id = ?");
        try {
            eikAYO.A5F(1, str);
            return Long.valueOf(eikAYO.AgN() ? eikAYO.getLong(0) : 0L);
        } finally {
            eikAYO.close();
        }
    }

    public static /* synthetic */ Object lambda$trimMessagesToCap$0(String str, String str2, int i, EJV ejv) {
        EIK eikAYO = ejv.AYO("DELETE FROM offline_messages WHERE vm_id = ? AND session_id = ? AND seq NOT IN (SELECT seq FROM offline_messages WHERE vm_id = ? AND session_id = ? ORDER BY seq DESC LIMIT ?)");
        try {
            EIK.A09(eikAYO, str, str2);
            eikAYO.A5F(3, str);
            eikAYO.A5F(4, str2);
            eikAYO.A5C(5, i);
            eikAYO.AgN();
            eikAYO.close();
            return null;
        } catch (Throwable th) {
            eikAYO.close();
            throw th;
        }
    }

    @Override // com.facebook.aura.conversation.offline.HatchOfflineConversationDao
    public void clearAllDataKeys() {
        BV5.A1D(this.__db, new G0U() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationDao_Impl$$ExternalSyntheticLambda4
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return HatchOfflineConversationDao_Impl.lambda$clearAllDataKeys$0((EJV) obj);
            }
        });
    }

    @Override // com.facebook.aura.conversation.offline.HatchOfflineConversationDao
    public void clearAllMessages() {
        BV5.A1D(this.__db, new G0U() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationDao_Impl$$ExternalSyntheticLambda2
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return HatchOfflineConversationDao_Impl.lambda$clearAllMessages$0((EJV) obj);
            }
        });
    }

    @Override // com.facebook.aura.conversation.offline.HatchOfflineConversationDao
    public void clearAllThreads() {
        BV5.A1D(this.__db, new G0U() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationDao_Impl$$ExternalSyntheticLambda17
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return HatchOfflineConversationDao_Impl.lambda$clearAllThreads$0((EJV) obj);
            }
        });
    }

    @Override // com.facebook.aura.conversation.offline.HatchOfflineConversationDao
    public void deleteMessagesExceptVm(final String str) {
        BV5.A1D(this.__db, new G0U() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationDao_Impl$$ExternalSyntheticLambda18
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return HatchOfflineConversationDao_Impl.lambda$deleteMessagesExceptVm$0(str, (EJV) obj);
            }
        });
    }

    @Override // com.facebook.aura.conversation.offline.HatchOfflineConversationDao
    public void deleteMessagesForEvictedThreads(final String str, final String str2, final int i) {
        BV5.A1D(this.__db, new G0U() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationDao_Impl$$ExternalSyntheticLambda15
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return HatchOfflineConversationDao_Impl.lambda$deleteMessagesForEvictedThreads$0(str, str2, i, (EJV) obj);
            }
        });
    }

    @Override // com.facebook.aura.conversation.offline.HatchOfflineConversationDao
    public void deleteMessagesForSession(final String str, final String str2) {
        BV5.A1D(this.__db, new G0U() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationDao_Impl$$ExternalSyntheticLambda10
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return HatchOfflineConversationDao_Impl.lambda$deleteMessagesForSession$0(str, str2, (EJV) obj);
            }
        });
    }

    @Override // com.facebook.aura.conversation.offline.HatchOfflineConversationDao
    public void deleteThread(final String str, final String str2) {
        BV5.A1D(this.__db, new G0U() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationDao_Impl$$ExternalSyntheticLambda11
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return HatchOfflineConversationDao_Impl.lambda$deleteThread$0(str, str2, (EJV) obj);
            }
        });
    }

    @Override // com.facebook.aura.conversation.offline.HatchOfflineConversationDao
    public void deleteThreadsBeyondLru(final String str, final int i) {
        BV5.A1D(this.__db, new G0U() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationDao_Impl$$ExternalSyntheticLambda0
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return HatchOfflineConversationDao_Impl.lambda$deleteThreadsBeyondLru$0(str, i, (EJV) obj);
            }
        });
    }

    @Override // com.facebook.aura.conversation.offline.HatchOfflineConversationDao
    public void deleteThreadsExceptVm(final String str) {
        BV5.A1D(this.__db, new G0U() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationDao_Impl$$ExternalSyntheticLambda20
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return HatchOfflineConversationDao_Impl.lambda$deleteThreadsExceptVm$0(str, (EJV) obj);
            }
        });
    }

    @Override // com.facebook.aura.conversation.offline.HatchOfflineConversationDao
    public HatchOfflineThreadEntity getThread(final String str, final String str2) {
        return (HatchOfflineThreadEntity) BV5.A0a(this.__db, new G0U() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationDao_Impl$$ExternalSyntheticLambda8
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return HatchOfflineConversationDao_Impl.lambda$getThread$0(str, str2, (EJV) obj);
            }
        });
    }

    /* renamed from: lambda$upsertDataKey$0$com-facebook-aura-conversation-offline-HatchOfflineConversationDao_Impl, reason: not valid java name */
    public /* synthetic */ Object m492xc66c3c49(HatchOfflineKeyEntity hatchOfflineKeyEntity, EJV ejv) {
        this.__insertAdapterOfHatchOfflineKeyEntity.insert(ejv, (EJV) hatchOfflineKeyEntity);
        return null;
    }

    /* renamed from: lambda$upsertMessages$0$com-facebook-aura-conversation-offline-HatchOfflineConversationDao_Impl, reason: not valid java name */
    public /* synthetic */ Object m493xf7fc1398(List list, EJV ejv) {
        this.__insertAdapterOfHatchOfflineMessageEntity.insert(ejv, list);
        return null;
    }

    /* renamed from: lambda$upsertThread$0$com-facebook-aura-conversation-offline-HatchOfflineConversationDao_Impl, reason: not valid java name */
    public /* synthetic */ Object m494x8973ddd6(HatchOfflineThreadEntity hatchOfflineThreadEntity, EJV ejv) {
        this.__insertAdapterOfHatchOfflineThreadEntity.insert(ejv, (EJV) hatchOfflineThreadEntity);
        return null;
    }

    @Override // com.facebook.aura.conversation.offline.HatchOfflineConversationDao
    public HatchOfflineKeyEntity loadDataKey(final int i) {
        return (HatchOfflineKeyEntity) BV5.A0a(this.__db, new G0U() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationDao_Impl$$ExternalSyntheticLambda9
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return HatchOfflineConversationDao_Impl.lambda$loadDataKey$0(i, (EJV) obj);
            }
        });
    }

    @Override // com.facebook.aura.conversation.offline.HatchOfflineConversationDao
    public List<HatchOfflineMessageEntity> loadLatestMessages(final String str, final String str2, final int i) {
        return (List) BV5.A0a(this.__db, new G0U() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationDao_Impl$$ExternalSyntheticLambda5
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return HatchOfflineConversationDao_Impl.lambda$loadLatestMessages$0(str, str2, i, (EJV) obj);
            }
        });
    }

    @Override // com.facebook.aura.conversation.offline.HatchOfflineConversationDao
    public HatchOfflineMessageEntity loadMessage(final String str, final String str2, final long j) {
        return (HatchOfflineMessageEntity) BV5.A0a(this.__db, new G0U() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationDao_Impl$$ExternalSyntheticLambda6
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return HatchOfflineConversationDao_Impl.lambda$loadMessage$0(str, str2, j, (EJV) obj);
            }
        });
    }

    @Override // com.facebook.aura.conversation.offline.HatchOfflineConversationDao
    public List<HatchOfflineMessageEntity> loadMessagesBefore(final String str, final String str2, final long j, final int i) {
        return (List) BV5.A0a(this.__db, new G0U() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationDao_Impl$$ExternalSyntheticLambda12
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return HatchOfflineConversationDao_Impl.lambda$loadMessagesBefore$0(str, str2, j, i, (EJV) obj);
            }
        });
    }

    @Override // com.facebook.aura.conversation.offline.HatchOfflineConversationDao
    public List<HatchOfflineThreadEntity> loadThreads(final String str) {
        return (List) BV5.A0a(this.__db, new G0U() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationDao_Impl$$ExternalSyntheticLambda13
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return HatchOfflineConversationDao_Impl.lambda$loadThreads$0(str, (EJV) obj);
            }
        });
    }

    @Override // com.facebook.aura.conversation.offline.HatchOfflineConversationDao
    public String oldestEvictableThread(final String str, final String str2) {
        return (String) BV5.A0a(this.__db, new G0U() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationDao_Impl$$ExternalSyntheticLambda1
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return HatchOfflineConversationDao_Impl.lambda$oldestEvictableThread$0(str, str2, (EJV) obj);
            }
        });
    }

    @Override // com.facebook.aura.conversation.offline.HatchOfflineConversationDao
    public long totalJsonBytes(final String str) {
        return C3cG.A05(BV5.A0a(this.__db, new G0U() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationDao_Impl$$ExternalSyntheticLambda3
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return HatchOfflineConversationDao_Impl.lambda$totalJsonBytes$0(str, (EJV) obj);
            }
        }));
    }

    @Override // com.facebook.aura.conversation.offline.HatchOfflineConversationDao
    public void trimMessagesToCap(final String str, final String str2, final int i) {
        BV5.A1D(this.__db, new G0U() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationDao_Impl$$ExternalSyntheticLambda21
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return HatchOfflineConversationDao_Impl.lambda$trimMessagesToCap$0(str, str2, i, (EJV) obj);
            }
        });
    }

    public HatchOfflineConversationDao_Impl(EIN ein) {
        this.__db = ein;
    }

    public static /* synthetic */ Object lambda$deleteMessagesBySeq$0(String str, String str2, String str3, List list, EJV ejv) {
        EIK eikAYO = ejv.AYO(str);
        try {
            EIK.A09(eikAYO, str2, str3);
            Iterator it = list.iterator();
            int i = 3;
            while (it.hasNext()) {
                eikAYO.A5C(i, BV4.A06(it.next()));
                i++;
            }
            eikAYO.AgN();
            eikAYO.close();
            return null;
        } catch (Throwable th) {
            eikAYO.close();
            throw th;
        }
    }

    @Override // com.facebook.aura.conversation.offline.HatchOfflineConversationDao
    public void deleteMessagesBySeq(final String str, final String str2, final List<Long> list) {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append("DELETE FROM offline_messages WHERE vm_id = ? AND session_id = ? AND seq IN (");
        AbstractC6599EJb.A00(sbA0w, list.size());
        final String strA10 = BV7.A10(sbA0w);
        BV5.A1D(this.__db, new G0U() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationDao_Impl$$ExternalSyntheticLambda7
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return HatchOfflineConversationDao_Impl.lambda$deleteMessagesBySeq$0(strA10, str, str2, list, (EJV) obj);
            }
        });
    }

    @Override // com.facebook.aura.conversation.offline.HatchOfflineConversationDao
    public void upsertDataKey(final HatchOfflineKeyEntity hatchOfflineKeyEntity) {
        hatchOfflineKeyEntity.getClass();
        BV5.A1D(this.__db, new G0U() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationDao_Impl$$ExternalSyntheticLambda16
            @Override // X.G0U
            public final Object invoke(Object obj) {
                HatchOfflineConversationDao_Impl hatchOfflineConversationDao_Impl = this.f$0;
                HatchOfflineKeyEntity hatchOfflineKeyEntity2 = hatchOfflineKeyEntity;
                hatchOfflineConversationDao_Impl.__insertAdapterOfHatchOfflineKeyEntity.insert((EJV) obj, (EJV) hatchOfflineKeyEntity2);
                return null;
            }
        });
    }

    @Override // com.facebook.aura.conversation.offline.HatchOfflineConversationDao
    public void upsertMessages(final List<HatchOfflineMessageEntity> list) {
        list.getClass();
        BV5.A1D(this.__db, new G0U() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationDao_Impl$$ExternalSyntheticLambda19
            @Override // X.G0U
            public final Object invoke(Object obj) {
                HatchOfflineConversationDao_Impl hatchOfflineConversationDao_Impl = this.f$0;
                List list2 = list;
                hatchOfflineConversationDao_Impl.__insertAdapterOfHatchOfflineMessageEntity.insert((EJV) obj, list2);
                return null;
            }
        });
    }

    @Override // com.facebook.aura.conversation.offline.HatchOfflineConversationDao
    public void upsertThread(final HatchOfflineThreadEntity hatchOfflineThreadEntity) {
        hatchOfflineThreadEntity.getClass();
        BV5.A1D(this.__db, new G0U() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationDao_Impl$$ExternalSyntheticLambda14
            @Override // X.G0U
            public final Object invoke(Object obj) {
                HatchOfflineConversationDao_Impl hatchOfflineConversationDao_Impl = this.f$0;
                HatchOfflineThreadEntity hatchOfflineThreadEntity2 = hatchOfflineThreadEntity;
                hatchOfflineConversationDao_Impl.__insertAdapterOfHatchOfflineThreadEntity.insert((EJV) obj, (EJV) hatchOfflineThreadEntity2);
                return null;
            }
        });
    }
}
