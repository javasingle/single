package com.single.singletest;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SingleTestApplicationTests {
//    @Autowired
//    Environment environment;
//
//    Properties properties = new Properties();
//
//    @Test
//    public void singletest(){
//        System.out.println("single spring test");
//        String[] defaultProfiles = environment.getDefaultProfiles();
//        System.out.println(defaultProfiles.length);
//        for (String defaultProfile : defaultProfiles) {
//            System.out.println(defaultProfile);
//        }
//
//        String[] activeProfiles = environment.getActiveProfiles();
//        for (String activeProfile : activeProfiles) {
//            System.out.println(activeProfile);
//        }
//
//
//        String property = environment.getProperty("server.port");
//        System.out.println(property);
//    }
//
//    @Test
//    public void test3() throws IOException {
//        InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("application.properties");
//
//        URL resource = Thread.currentThread().getContextClassLoader().getResource("application.properties");
//        String file = resource.getFile();
//        System.out.println(file);
//        // File file = new File(resource.getPath()+"application.properties");
//       // FileOutputStream fileOutputStream = new FileOutputStream(file);
//
//
//        System.out.println(resourceAsStream);
//        properties.load(resourceAsStream);
//        String property = properties.getProperty("server.port");
//        System.out.println(property);
//
//        properties.setProperty("server.port","90");
//      //  properties.store(fileOutputStream,"");
//      //  fileOutputStream.close();
//    }
//
//
//    @Test
//    public void test4(){
//        String str = (new SimpleDateFormat("yyyyMMddHHmmssSSS")).format(new Date());
//        System.out.println(str);
//        long currentTimeMillis = System.currentTimeMillis();
//        System.out.println(currentTimeMillis);
//
//    }
//
//
//    @Test
//    public  void test5(){
//        AsynchronousJiraRestClientFactory asynchronousJiraRestClientFactory = new AsynchronousJiraRestClientFactory();
//        JiraRestClient jiraRestClient = asynchronousJiraRestClientFactory.createWithBasicHttpAuthentication(URI.create("https://jira.zaouter.com/"), "zawb-lizhenbin", "Aaa123456");
//        Issue issue = jiraRestClient.getIssueClient().getIssue("GAIA-226").claim();
//        System.out.println(issue);
//        System.out.println("=========================================");
//
//
//
//
//    }
//
//    /**
//     * 测试创建issue
//     */
//    @Test
//    public void test6() {
//
//        AsynchronousJiraRestClientFactory asynchronousJiraRestClientFactory = new AsynchronousJiraRestClientFactory();
//        JiraRestClient jiraRestClient = asynchronousJiraRestClientFactory.createWithBasicHttpAuthentication(URI.create("https://jira.zaouter.com/"), "zawb-lizhenbin", "Aaa123456");
//
//        Issue issue = jiraRestClient.getIssueClient().getIssue("GAIA-226").claim();
//        System.out.println(issue);
//        System.out.println("=========================================");
//
//
//        try {
//            IssueInputBuilder builder = new IssueInputBuilder("GAIA",
//                    10202L, "测试通过api创建issue");
//            builder.setDescription("issue description");
//            builder.setComponents(issue.getComponents());
//            //设定父问题
//            Map<String, Object> parent = new HashMap<String, Object>();
//            parent.put("key", "GAIA-226");
//            FieldInput parentField = new FieldInput("parent", new ComplexIssueInputFieldValue(parent));
//            builder.setFieldInput(parentField);
//            Promise<User> user = jiraRestClient.getUserClient().getUser("zawb-lizhenbin");
//            User user2 = user.claim();
//            builder.setAssignee(user2);
//            final IssueInput input = builder.build();
//
//            try {
//                // create issue
//                final IssueRestClient client = jiraRestClient.getIssueClient();
//                final BasicIssue issue1 = client.createIssue(input).claim();
//                final Issue actual = client.getIssue(issue1.getKey()).claim();
//                System.out.println(actual);
//            }catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//    }
//    /**
//     * 测试获取用户
//     */
//    @Test
//    public void test7(){
//
//        AsynchronousJiraRestClientFactory asynchronousJiraRestClientFactory = new AsynchronousJiraRestClientFactory();
//        JiraRestClient jiraRestClient = asynchronousJiraRestClientFactory.createWithBasicHttpAuthentication(URI.create("https://jira.zaouter.com/"), "zawb-lizhenbin", "Aaa123456");
//        //User user = jiraRestClient.getUserClient().getUser("jiangchao002").claim();
//       // System.out.println(user);
//        Promise<Iterable<User>> users = jiraRestClient.getUserClient().findUsers("lizhenbin");
//        users.claim().forEach(user -> System.out.println(user));
//    }
//
//    /**
//     * 测试获取类型
//     */
//    @Test
//    public void  test8(){
//        AsynchronousJiraRestClientFactory asynchronousJiraRestClientFactory = new AsynchronousJiraRestClientFactory();
//        JiraRestClient jiraRestClient = asynchronousJiraRestClientFactory.createWithBasicHttpAuthentication(URI.create("https://jira.zaouter.com/"), "zawb-lizhenbin", "Aaa123456");
//
//        Promise<Iterable<IssueType>> issueTypes = jiraRestClient.getMetadataClient().getIssueTypes();
//        for (IssueType issueType : issueTypes.claim()) {
//            System.out.println(issueType);
//        }
//    }


    @Test
    public void test() {
        List mock = mock(List.class);
        mock.add(6);
        verify(mock).add(6);
    }
}
