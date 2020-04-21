package cn.lcl.dto;

import cn.lcl.pojo.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 添加一个事务时传输的实体，包括了事务所有关联的东西。
 */
@EqualsAndHashCode(callSuper = true) // callSuper是在验证equals时是否比较父类的field
@Data
public class ThingDTO extends Thing {

    @NotEmpty(message = "事务接受者不能为空")
    private Integer[] receiverIds;

    @NotNull(message = "tagId not null")
    private Integer tagId;

    private List<MultipartFile> files;

    private List<ThingQuestion> questions;

}