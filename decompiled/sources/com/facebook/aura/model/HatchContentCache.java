package com.facebook.aura.model;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.memory.AuraByteLruCache;
import com.facebook.aura.memory.AuraMemoryBudget;
import com.facebook.aura.model.HatchContentViewModelData;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class HatchContentCache {
    public static final int $stable = 0;
    public static final long ASSUMED_PARSED_BYTES_PER_SOURCE_CHAR = 8;
    public static final long ENTRY_OVERHEAD_BYTES = 1024;
    public static final HatchContentCache INSTANCE = new HatchContentCache();
    public static final int MAX_ENTRIES = 4;
    public static final long MAX_WEIGHT_BYTES = 8388608;
    public static final AuraByteLruCache<String, HatchContentViewModelData> cache;

    static {
        long j = 0;
        cache = new AuraByteLruCache<>(4, 8388608L, j, true, j, HatchContentCache$cache$1.INSTANCE, 20, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long estimatedWeightBytes(HatchContentViewModelData hatchContentViewModelData) {
        long jStringBytes;
        AuraMemoryBudget auraMemoryBudget;
        long jStringBytes2;
        String str;
        long jStringBytes3;
        long jStringBytes4;
        if (!(hatchContentViewModelData instanceof HatchContentViewModelData.Markdown)) {
            jStringBytes = 0;
            if (hatchContentViewModelData instanceof HatchContentViewModelData.Table) {
                AuraMemoryBudget auraMemoryBudget2 = AuraMemoryBudget.INSTANCE;
                HatchContentViewModelData.Table table = (HatchContentViewModelData.Table) hatchContentViewModelData;
                String str2 = table.rawMarkdown;
                jStringBytes3 = auraMemoryBudget2.stringBytes(str2) + parsedBytes(str2);
                for (HatchTableCellDataModel hatchTableCellDataModel : table.tableParams.data) {
                    AuraMemoryBudget auraMemoryBudget3 = AuraMemoryBudget.INSTANCE;
                    jStringBytes += auraMemoryBudget3.stringBytes(hatchTableCellDataModel.text) + auraMemoryBudget3.stringBytes(hatchTableCellDataModel.mathExpression);
                }
            } else {
                if (hatchContentViewModelData instanceof HatchContentViewModelData.Code) {
                    auraMemoryBudget = AuraMemoryBudget.INSTANCE;
                    HatchContentViewModelData.Code code = (HatchContentViewModelData.Code) hatchContentViewModelData;
                    long jStringBytes5 = auraMemoryBudget.stringBytes(code.rawMarkdown);
                    HatchCodeParams hatchCodeParams = code.codeParams;
                    jStringBytes2 = jStringBytes5 + auraMemoryBudget.stringBytes(hatchCodeParams.codeContent);
                    str = hatchCodeParams.language;
                } else {
                    if (!(hatchContentViewModelData instanceof HatchContentViewModelData.InlineImage)) {
                        if (hatchContentViewModelData instanceof HatchContentViewModelData.InlineImageGroup) {
                            for (HatchContentViewModelData.InlineImage inlineImage : ((HatchContentViewModelData.InlineImageGroup) hatchContentViewModelData).images) {
                                AuraMemoryBudget auraMemoryBudget4 = AuraMemoryBudget.INSTANCE;
                                jStringBytes += auraMemoryBudget4.stringBytes(inlineImage.alt) + auraMemoryBudget4.stringBytes(inlineImage.url) + auraMemoryBudget4.stringBytes(inlineImage.workspacePath);
                            }
                        } else if (hatchContentViewModelData instanceof HatchContentViewModelData.InlineFile) {
                            AuraMemoryBudget auraMemoryBudget5 = AuraMemoryBudget.INSTANCE;
                            HatchContentViewModelData.InlineFile inlineFile = (HatchContentViewModelData.InlineFile) hatchContentViewModelData;
                            jStringBytes3 = auraMemoryBudget5.stringBytes(inlineFile.fileName) + auraMemoryBudget5.stringBytes(inlineFile.url) + auraMemoryBudget5.stringBytes(inlineFile.mimeType);
                            Iterator it = inlineFile.thumbnailUrls.iterator();
                            while (it.hasNext()) {
                                jStringBytes += AuraMemoryBudget.INSTANCE.stringBytes(AnonymousClass005.A0j(it));
                            }
                        } else if (hatchContentViewModelData instanceof HatchContentViewModelData.InlineSlides) {
                            auraMemoryBudget = AuraMemoryBudget.INSTANCE;
                            HatchContentViewModelData.InlineSlides inlineSlides = (HatchContentViewModelData.InlineSlides) hatchContentViewModelData;
                            jStringBytes2 = auraMemoryBudget.stringBytes(inlineSlides.fileName);
                            str = inlineSlides.url;
                        } else if (hatchContentViewModelData instanceof HatchContentViewModelData.InlineHtml) {
                            auraMemoryBudget = AuraMemoryBudget.INSTANCE;
                            HatchContentViewModelData.InlineHtml inlineHtml = (HatchContentViewModelData.InlineHtml) hatchContentViewModelData;
                            jStringBytes2 = auraMemoryBudget.stringBytes(inlineHtml.fileName);
                            str = inlineHtml.url;
                        } else if (hatchContentViewModelData instanceof HatchContentViewModelData.EmbeddedFileHTMLContent) {
                            auraMemoryBudget = AuraMemoryBudget.INSTANCE;
                            HatchContentViewModelData.EmbeddedFileHTMLContent embeddedFileHTMLContent = (HatchContentViewModelData.EmbeddedFileHTMLContent) hatchContentViewModelData;
                            jStringBytes2 = auraMemoryBudget.stringBytes(embeddedFileHTMLContent.filepath);
                            str = embeddedFileHTMLContent.htmlContent;
                        } else if (hatchContentViewModelData instanceof HatchContentViewModelData.MermaidDiagram) {
                            auraMemoryBudget = AuraMemoryBudget.INSTANCE;
                            HatchContentViewModelData.MermaidDiagram mermaidDiagram = (HatchContentViewModelData.MermaidDiagram) hatchContentViewModelData;
                            jStringBytes2 = auraMemoryBudget.stringBytes(mermaidDiagram.mermaidSource);
                            str = mermaidDiagram.rawMarkdown;
                        } else if (hatchContentViewModelData instanceof HatchContentViewModelData.Math) {
                            jStringBytes = AuraMemoryBudget.INSTANCE.stringBytes(((HatchContentViewModelData.Math) hatchContentViewModelData).expression);
                        } else if (!C7384Etj.areEqual(hatchContentViewModelData, HatchContentViewModelData.Divider.INSTANCE)) {
                            throw C3cG.A0q();
                        }
                        return jStringBytes + 1024;
                    }
                    auraMemoryBudget = AuraMemoryBudget.INSTANCE;
                    HatchContentViewModelData.InlineImage inlineImage2 = (HatchContentViewModelData.InlineImage) hatchContentViewModelData;
                    jStringBytes2 = auraMemoryBudget.stringBytes(inlineImage2.alt) + auraMemoryBudget.stringBytes(inlineImage2.url);
                    str = inlineImage2.workspacePath;
                }
                jStringBytes4 = auraMemoryBudget.stringBytes(str);
            }
            jStringBytes += jStringBytes3;
            return jStringBytes + 1024;
        }
        AuraMemoryBudget auraMemoryBudget6 = AuraMemoryBudget.INSTANCE;
        String str3 = ((HatchContentViewModelData.Markdown) hatchContentViewModelData).markdown;
        jStringBytes2 = auraMemoryBudget6.stringBytes(str3);
        jStringBytes4 = parsedBytes(str3);
        jStringBytes = jStringBytes2 + jStringBytes4;
        return jStringBytes + 1024;
    }

    private final long parsedBytes(String str) {
        return (str != null ? str.length() : 0) * 8;
    }

    public final void clear() {
        cache.clear();
    }

    public final void delete(String str) {
        if (str != null) {
            cache.remove(str);
        }
    }

    public final HatchContentViewModelData get(String str) {
        if (str != null) {
            return cache.get(str);
        }
        return null;
    }

    public final HatchContentViewModelData getAndDelete(String str) {
        if (str != null) {
            return cache.remove(str);
        }
        return null;
    }

    public final void put(String str, HatchContentViewModelData hatchContentViewModelData) {
        AnonymousClass003.A0u(str, hatchContentViewModelData);
        cache.put(str, hatchContentViewModelData);
    }
}
