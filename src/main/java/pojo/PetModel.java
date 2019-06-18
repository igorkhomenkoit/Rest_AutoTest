package pojo;

import java.util.List;

public class PetModel {
    private List<String> photoUrls;

    private String name;

    private Integer id;

    private Category category;

    private List<TagsItem> tags;

    private String status;

    public PetModel(List<String> photoUrls, String name, Integer id, Category category, List<TagsItem> tags, String status) {
        this.photoUrls = photoUrls;
        this.name = name;
        this.id = id;
        this.category = category;
        this.tags = tags;
        this.status = status;
    }


}
