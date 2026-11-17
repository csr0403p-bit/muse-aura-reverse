package com.facebook.aura.library.repo;

import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFI;
import X.C06G;
import X.C06H;
import X.C60O;
import X.C60P;
import X.C60R;
import X.C7384Etj;
import X.C7BY;
import X.Ey9;
import X.F3w;
import X.FGI;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.agentpermission.ConnectorOrderCheckoutRowsKt;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.file.core.HatchMimeResolver;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes3.dex */
public final class WorkspaceEntry extends C06G {
    public static final Companion Companion = new Companion();
    public static final Set<String> EDITABLE_TEXT_EXTENSIONS;
    public final String modifiedAt;
    public final String name;
    public final String relativePath;
    public final Long size;
    public final EntryType type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public final class EntryType {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ EntryType[] $VALUES;
        public static final EntryType DIRECTORY;
        public static final EntryType FILE;

        static {
            EntryType entryType = new EntryType("FILE", 0);
            FILE = entryType;
            EntryType entryType2 = new EntryType("DIRECTORY", 1);
            DIRECTORY = entryType2;
            EntryType[] entryTypeArr = {entryType, entryType2};
            $VALUES = entryTypeArr;
            $ENTRIES = new F3w(entryTypeArr);
        }

        public static Ey9<EntryType> getEntries() {
            return $ENTRIES;
        }

        public static EntryType valueOf(String str) {
            return (EntryType) Enum.valueOf(EntryType.class, str);
        }

        public static EntryType[] values() {
            return (EntryType[]) $VALUES.clone();
        }

        public EntryType(String str, int i) {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WorkspaceEntry) {
                WorkspaceEntry workspaceEntry = (WorkspaceEntry) obj;
                if (!C7384Etj.areEqual(this.name, workspaceEntry.name) || this.type != workspaceEntry.type || !C7384Etj.areEqual(this.relativePath, workspaceEntry.relativePath) || !C7384Etj.areEqual(this.size, workspaceEntry.size) || !C7384Etj.areEqual(this.modifiedAt, workspaceEntry.modifiedAt)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        String[] strArr = new String[34];
        System.arraycopy(new String[]{"md", "markdown", "mdown", "txt", "text", "json", "yaml", "yml", "toml", "xml", "plist", "swift", "ts", "js", "jsx", "tsx", "py", "rs", "go", "rb", "java", "c", "cpp", "h", "hpp", "sh", "zsh"}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{"bash", "sql", "css", "scss", "html", "htm", "kt"}, 0, strArr, 27, 7);
        EDITABLE_TEXT_EXTENSIONS = BFI.A0H(strArr);
    }

    public static /* synthetic */ WorkspaceEntry copy$default(WorkspaceEntry workspaceEntry, String str, EntryType entryType, String str2, Long l, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = workspaceEntry.name;
        }
        if ((i & 2) != 0) {
            entryType = workspaceEntry.type;
        }
        if ((i & 4) != 0) {
            str2 = workspaceEntry.relativePath;
        }
        if ((i & 8) != 0) {
            l = workspaceEntry.size;
        }
        if ((i & 16) != 0) {
            str3 = workspaceEntry.modifiedAt;
        }
        return workspaceEntry.copy(str, entryType, str2, l, str3);
    }

    public final String component1() {
        return this.name;
    }

    public final EntryType component2() {
        return this.type;
    }

    public final String component3() {
        return this.relativePath;
    }

    public final Long component4() {
        return this.size;
    }

    public final String component5() {
        return this.modifiedAt;
    }

    public final String getFileExtension() {
        if (this.type != EntryType.FILE) {
            return null;
        }
        int iA09 = C7BY.A09(this.name, '.', C60R.A02(r2) - 1);
        if (iA09 < 0) {
            return null;
        }
        String str = this.name;
        if (iA09 != str.length() - 1) {
            return AnonymousClass001.A0u(str.substring(iA09 + 1));
        }
        return null;
    }

    public final String getFileInfo() {
        if (this.type == EntryType.DIRECTORY) {
            return "Folder";
        }
        String fileExtension = getFileExtension();
        String upperCase = fileExtension != null ? fileExtension.toUpperCase(Locale.ROOT) : "File";
        String formattedSize = getFormattedSize();
        return formattedSize != null ? FGI.A0U(upperCase, ConnectorOrderCheckoutRowsKt.DETAIL_SEPARATOR, formattedSize) : upperCase;
    }

    public final String getFormattedSize() {
        Long l = this.size;
        if (l == null) {
            return null;
        }
        long jLongValue = l.longValue();
        if (jLongValue <= 0) {
            return "0 B";
        }
        String[] strArr = {"B", "KB", "MB", "GB"};
        double d = jLongValue;
        int i = 0;
        while (true) {
            if (d >= 1024.0d) {
                if (i >= 3) {
                    break;
                }
                d /= 1024.0d;
                i++;
            } else if (i == 0) {
                String str = strArr[i];
                StringBuilder sbA0w = C60O.A0w();
                sbA0w.append((int) d);
                return C60P.A1M(InviteCodeScratcherKt.CODE_SEPARATOR, str, sbA0w);
            }
        }
        return String.format(Locale.US, "%.1f %s", Arrays.copyOf(new Object[]{Double.valueOf(d), strArr[i]}, 2));
    }

    public final String getIconName() {
        if (this.type == EntryType.DIRECTORY) {
            return "folder";
        }
        String fileExtension = getFileExtension();
        return ("md".equals(fileExtension) || "txt".equals(fileExtension) || "text".equals(fileExtension)) ? HatchWebPageParserKt.DESCRIPTION : ("json".equals(fileExtension) || "yaml".equals(fileExtension) || "yml".equals(fileExtension) || "toml".equals(fileExtension) || "xml".equals(fileExtension) || "plist".equals(fileExtension)) ? "data_object" : ("swift".equals(fileExtension) || "ts".equals(fileExtension) || "js".equals(fileExtension) || "py".equals(fileExtension) || "rs".equals(fileExtension) || "go".equals(fileExtension) || "rb".equals(fileExtension) || "java".equals(fileExtension) || "c".equals(fileExtension) || "cpp".equals(fileExtension) || "h".equals(fileExtension) || "kt".equals(fileExtension)) ? AuraDeeplinkRouteMapper.CODE_PARAM : ("html".equals(fileExtension) || "htm".equals(fileExtension) || "css".equals(fileExtension)) ? "language" : AbstractC0878AGe.A0k(HatchMimeResolver.Extensions.IMAGE, fileExtension) ? "image" : "pdf".equals(fileExtension) ? "picture_as_pdf" : ("mp3".equals(fileExtension) || "m4a".equals(fileExtension) || "wav".equals(fileExtension) || "ogg".equals(fileExtension) || "aac".equals(fileExtension)) ? "audio_file" : ("mp4".equals(fileExtension) || "mov".equals(fileExtension) || "avi".equals(fileExtension) || "mkv".equals(fileExtension)) ? "video_file" : ("zip".equals(fileExtension) || "gz".equals(fileExtension) || "tar".equals(fileExtension) || "7z".equals(fileExtension) || "rar".equals(fileExtension)) ? "folder_zip" : "insert_drive_file";
    }

    public final String getModifiedAt() {
        return this.modifiedAt;
    }

    public final Date getModifiedDate() {
        String str = this.modifiedAt;
        if (str == null || C7BY.A0j(str)) {
            return null;
        }
        try {
            try {
                return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US).parse(str);
            } catch (Exception unused) {
                return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US).parse(str);
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public final String getName() {
        return this.name;
    }

    public final String getRelativePath() {
        return this.relativePath;
    }

    public final Long getSize() {
        return this.size;
    }

    public final EntryType getType() {
        return this.type;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.relativePath, AnonymousClass005.A0F(this.type, AnonymousClass001.A0G(this.name))) + AnonymousClass006.A0D(this.size)) * 31) + AnonymousClass005.A0H(this.modifiedAt);
    }

    public final boolean isEditableText() {
        if (this.type != EntryType.FILE) {
            return false;
        }
        return AbstractC0878AGe.A0k(EDITABLE_TEXT_EXTENSIONS, getFileExtension());
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public WorkspaceEntry(String str, EntryType entryType, String str2, Long l, String str3) {
        AnonymousClass005.A0x(str, entryType, str2);
        this.name = str;
        this.type = entryType;
        this.relativePath = str2;
        this.size = l;
        this.modifiedAt = str3;
    }

    public final WorkspaceEntry copy(String str, EntryType entryType, String str2, Long l, String str3) {
        AnonymousClass005.A0x(str, entryType, str2);
        return new WorkspaceEntry(str, entryType, str2, l, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ WorkspaceEntry(String str, EntryType entryType, String str2, Long l, String str3, int i, C06H c06h) {
        this(str, entryType, str2, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str3);
    }
}
