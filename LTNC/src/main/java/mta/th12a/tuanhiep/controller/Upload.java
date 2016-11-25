package mta.th12a.tuanhiep.controller;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
@Controller
@RequestMapping(value="/demo")
public class Upload {
@RequestMapping(value="/index")
public String Index()
{
	return "upload";
}
@RequestMapping(value="/upload",method = RequestMethod.POST)
public @ResponseBody String save(HttpServletRequest request,@RequestParam MultipartFile files)
{
	if (!files.isEmpty()) {
        try {
            byte[] bytes = files.getBytes();
            String fileName=files.getOriginalFilename();
            // Creating the directory to store file
			String uploadRootPath = "E:/HOCTAP/HOC VIEN/Nam 4/GITHUB/LTNC/LTNC/src/main/webapp/WEB-INF/resources/images/upload";
            // Create the file on server
            File serverFile = new File(uploadRootPath + File.separator + fileName);
            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
            stream.write(bytes);
            stream.close();
            return "";
        } catch (Exception e) {
            return "You failed to upload " + " => " + e.getMessage();
        }
    } else {
        return "You failed to upload "
                + " because the file was empty.";
    }
}
}
